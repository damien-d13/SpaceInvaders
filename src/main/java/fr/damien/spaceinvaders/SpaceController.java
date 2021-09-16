package fr.damien.spaceinvaders;

import fr.damien.spaceinvaders.entities.*;
import fr.damien.spaceinvaders.utils.Constants;
import fr.damien.spaceinvaders.utils.Initialisation;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;

public class SpaceController {

    private Ship ship;
    private ShipShoot shipShoot;
    private AnimationTimer timer;
    private static int shipDeltaX;
    private List<Brick> walls;
    private Alien[][] aliens;
    private static long movingAliensCount = 0;
    private Group groupExplosion;




    @FXML
    private Pane board;

    @FXML
    private Label lblEndGame, lblScore;

    public SpaceController() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                movingAliensCount++;
                handleShip();


                if (ship.isShipIsShooting()) {
                    handleShipShoot();
                    shipShootCollisions();
                }
                //Lag effect
                if (movingAliensCount % (100 - (10L * Alien.getSpeed())) == 0) {
                    Alien.aliensMoving(aliens);
                    System.out.println(Alien.getSpeed());

                }


            }


        };
    }


    public void initGame() {
        ship = new Ship(Constants.X_POS_INIT_SHIP, Constants.Y_POS_INIT_ShIP, Constants.SHIP_WIDTH, Constants.SHIP_HEIGHT);
        shipShoot = new ShipShoot(-Constants.SHIP_SHOOT_WIDTH, -Constants.SHIP_SHOOT_HEIGHT, Constants.SHIP_SHOOT_WIDTH, Constants.SHIP_SHOOT_HEIGHT);
        walls = new LinkedList<>();
        aliens = new Alien[5][10];

        movingAliensCount = 0;

        groupExplosion = new Group(Explosion.explode());

        lblEndGame.setText("");
    }

    @FXML
    void onStartAction() {
        board.requestFocus();
        initGame();
        Initialisation.initShip(ship, board);
        Initialisation.initShipShoot(shipShoot, board);
        Initialisation.initWalls(80, 400, 80, walls, board);
        Initialisation.initAliens(aliens, board);


        timer.start();

    }

    @FXML
    void onKeyPressed(KeyEvent keyEvent) {

        switch (keyEvent.getCode()) {
            case LEFT:
                shipDeltaX = -Constants.SHIP_DELTAX;
                handleShip();
                break;
            case RIGHT:
                shipDeltaX = Constants.SHIP_DELTAX;
                handleShip();
                break;
            case SPACE:
                if (!ship.isShipIsShooting()) {
                    ship.setShipIsShooting(true);
                    shipShoot.shipShootPlacement(shipShoot, ship);
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
            shipShoot.setY(shipShoot.getY() - Constants.SHIP_SHOOT_DELTAY);
        }
    }

    private void shipMoveHorizontal(int shipDeltaX) {
        ship.setX(ship.shipMoving(shipDeltaX));
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

        if (brickToRemove != null) {
            walls.remove(brickToRemove);
            board.getChildren().remove(brickToRemove);
        }

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

                    board.getChildren().remove(alien);
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
    }
}