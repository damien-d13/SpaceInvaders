package fr.damien.spaceinvaders;

import fr.damien.spaceinvaders.entities.*;
import fr.damien.spaceinvaders.utils.Audio;
import fr.damien.spaceinvaders.utils.Constants;
import fr.damien.spaceinvaders.utils.Initialisation;
import fr.damien.spaceinvaders.utils.Sounds;
import javafx.animation.AnimationTimer;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SpaceController {

    private Ship ship;
    private ShipShoot shipShoot;
    private final AnimationTimer timer;
    private static int shipDeltaX;
    private List<Brick> walls;
    private Alien[][] aliens;
    private static long movingAliensCount = 0;
    private Group groupExplosion;
    private final IntegerProperty score = new SimpleIntegerProperty(0);
    private static boolean initStartButton = false;
    private static Random random = new Random();
    private static LinkedList<AlienShoot> alienShootList;
    private Saucer saucer;
    private long saucerTime = 0;





    @FXML
    private Pane board;

    @FXML
    private Label lblEndGame, lblScore;

    public SpaceController() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                movingAliensCount++;
                saucerTime++;
                handleShip();

                collisions();

                if (ship.isShipIsShooting()) {
                    handleShipShoot();
                }
                //Lag effect
                if (movingAliensCount % (100 - (10L * Alien.getSpeed())) == 0) {
                    Alien.aliensMoving(aliens);
                }

                if (saucerTime % 400 == 0) {
                    saucer = new Saucer(Constants.X_POS_INIT_SAUCER, Constants.Y_POS_INIT_SAUCER, Constants.SAUCER_WIDTH, Constants.SHIP_HEIGHT);
                    board.getChildren().add(saucer);
                    saucerTime = 1;
                } else if (saucer != null){
                    saucer.saucerMoving(Constants.SAUCER_DELTA_X);
                }

                aliensShooting();
                AlienShoot.handleAliensShot(alienShootList, board);

            }
        };
    }


    public void initGame() {
        ship = new Ship(Constants.X_POS_INIT_SHIP, Constants.Y_POS_INIT_ShIP, Constants.SHIP_WIDTH, Constants.SHIP_HEIGHT);
        shipShoot = new ShipShoot(-Constants.SHIP_SHOOT_WIDTH, -Constants.SHIP_SHOOT_HEIGHT, Constants.SHIP_SHOOT_WIDTH, Constants.SHIP_SHOOT_HEIGHT);
        walls = new LinkedList<>();
        aliens = new Alien[5][10];

        movingAliensCount = 0;

        score.set(0);

        groupExplosion = new Group(Explosion.explode());

        alienShootList = new LinkedList<>();

        lblEndGame.setText("");
    }

    @FXML
    void onStartAction() {
        if (!initStartButton) {
            board.requestFocus();
            initGame();
            Initialisation.initShip(ship, board);
            Initialisation.initShipShoot(shipShoot, board);
            Initialisation.initWalls(80, 400, 80, walls, board);
            Initialisation.initAliens(aliens, board);


            timer.start();
            lblScore.textProperty().bind(Bindings.convert(score));
            initStartButton = true;
        }
    }

    @FXML
    void onKeyPressed(KeyEvent keyEvent) {

        switch (keyEvent.getCode()) {
            case LEFT:
                shipDeltaX = -Constants.SHIP_DELTA_X;
                handleShip();
                break;
            case RIGHT:
                shipDeltaX = Constants.SHIP_DELTA_X;
                handleShip();
                break;
            case SPACE:

                if (!ship.isShipIsShooting()) {
                    ship.setShipIsShooting(true);
                    shipShoot.shipShootPlacement(shipShoot, ship);
                    Audio.playSound(Sounds.SHIP_SHOOT_SOUND);
                }
                break;
        }
    }

    private void handleShip() {
        shipMoveHorizontal(shipDeltaX);
    }

    private void handleShipShoot() {
        if (shipShoot.getY() <= -20) {
            ship.setShipIsShooting(false);
        } else if (shipShoot.getY() >= -20) {
            shipShoot.setY(shipShoot.getY() - Constants.SHIP_SHOOT_DELTA_Y);
        }
    }

    private void aliensShooting() {
        for(Alien[] alienRow : aliens) {
            for (Alien alien : alienRow) {
                if (!alien.isDead()) {
                    if (random.nextInt(Constants.ALIEN_SHOOT_PROBABILITY) == 50){
                        AlienShoot alienShoot = new AlienShoot(alien.getX() + (Constants.ALIEN_WIDTH / 2), alien.getY(), Constants.ALIEN_SHOOT_WIDTH, Constants.ALIEN_SHOOT_HEIGHT);
                        alienShootList.add(alienShoot);
                        board.getChildren().add(alienShoot);

                    }
                }

            }
        }
    }

    private void shipMoveHorizontal(int shipDeltaX) {
        ship.setX(ship.shipMoving(shipDeltaX));
    }

    private void collisions() {
        shipShootCollisions();
        aliensShootBrickCollisions();
        aliensWallsCollisions();
    }

    private void aliensWallsCollisions() {
        Brick brickToRemove = null;
        for (Brick brick : walls) {
            for (Alien[] alienRow : aliens) {
                for (Alien alien : alienRow) {
                    if (brick.getBoundsInParent().intersects(alien.getBoundsInParent())) {
                        brickToRemove = brick;

                    }
                }
            }
        }
        removeBrick(brickToRemove);
    }

    private void aliensShootBrickCollisions() {
        Brick brickToRemove = null;
        AlienShoot shootToRemove = null;
        for (Brick brick : walls) {
            for (AlienShoot alienShoot : alienShootList) {
                if (brick.getBoundsInParent().intersects(alienShoot.getBoundsInParent())) {
                    brickToRemove = brick;
                    shootToRemove = alienShoot;
                }

            }
        }
        removeBrick(brickToRemove);
        removeShoot(shootToRemove);
    }

    private void removeBrick(Brick brickToRemove) {
        if (brickToRemove != null) {
            walls.remove(brickToRemove);
            board.getChildren().remove(brickToRemove);
            Audio.playSound(Sounds.BRICK_DESTRUCTION_SOUND);

            if (score.get() >= Constants.BRICK_POINT) {
                score.set(score.get() - Constants.BRICK_POINT);
            }
        }
    }

    private void removeShoot(AlienShoot shootToRemove) {
        alienShootList.remove(shootToRemove);
        board.getChildren().remove(shootToRemove);

    }

    private void shipShootCollisions() {
        Brick brickToRemove = null;

        for (Brick brick : walls) {
            if (brick.getBoundsInParent().intersects(shipShoot.getBoundsInParent())) {
                shipShoot.setX(-10);
                shipShoot.setY(-10);

                ship.setShipIsShooting(false);

                brickToRemove = brick;
            }
        }

        removeBrick(brickToRemove);

        for(Alien[] alienRow : aliens) {
            for (Alien alien : alienRow) {
                if (alien.getBoundsInParent().intersects(shipShoot.getBoundsInParent())) {
                    shipShoot.setX(-10);
                    shipShoot.setY(-10);

                    ship.setShipIsShooting(false);


                    groupExplosion = new Group(Explosion.explode());
                    groupExplosion.setLayoutX(alien.getX() - 10);
                    groupExplosion.setLayoutY(alien.getY() - 10);
                    board.getChildren().addAll(groupExplosion);

                    alien.setX(100);
                    alien.setY(-1000);

                    alien.setDead(true);

                    score.set(score.get() + ( Alien.getType() * Constants.ALIEN_POINT));

                    board.getChildren().remove(alien);
                    Audio.playSound(Sounds.ALIEN_DESTRUCTION_SOUND);
                }
            }
        }
    }



    @FXML
    void onKeyReleased(KeyEvent keyEvent) {

        shipDeltaX = 0;
    }

    @FXML
    void onStopAction() {
        timer.stop();
        initStartButton = false;
        walls.clear();
        alienShootList.clear();
        Alien.setSpeed(Constants.ALIEN_SPEED);
        board.getChildren().clear();
        if (saucer != null){
            saucer.getSaucerPassingSound().stop();
        }
    }
}