package fr.damien.spaceinvaders;

import fr.damien.spaceinvaders.entities.Brick;
import fr.damien.spaceinvaders.entities.Ship;
import fr.damien.spaceinvaders.entities.ShipShoot;
import fr.damien.spaceinvaders.utils.Constants;
import fr.damien.spaceinvaders.utils.Initialisation;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

    @FXML
    private Pane board;

    @FXML
    private Label lblEndGame, lblScore;

    public SpaceController() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                handleShip();

                if(ship.isShipIsShooting()) {
                    handleShipShoot();
                    shipShootCollisions();
                }
            }
        };
    }


    public void initGame() {
        ship = new Ship(Constants.X_POS_INIT_SHIP, Constants.Y_POS_INIT_ShIP, Constants.SHIP_WIDTH, Constants.SHIP_HEIGHT);
        shipShoot = new ShipShoot(0 - Constants.SHIP_SHOOT_WIDTH , 0 - Constants.SHIP_SHOOT_HEIGHT, Constants.SHIP_SHOOT_WIDTH, Constants.SHIP_SHOOT_HEIGHT);
        walls = new LinkedList<>();

        lblEndGame.setText("");
    }

    @FXML
    void onStartAction() {
        board.requestFocus();
        initGame();
        Initialisation.initShip(ship, board);
        Initialisation.initShipShoot(shipShoot, board);
        Initialisation.initWalls(80, 400, 80, walls, board);

        timer.start();

    }
    @FXML
    void onKeyPressed(KeyEvent keyEvent) {

        switch (keyEvent.getCode()) {
            case LEFT:
                shipDeltaX = - Constants.SHIP_DELTAX;
                handleShip();
                break;
            case RIGHT:
                shipDeltaX =  Constants.SHIP_DELTAX;
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
        }else if (shipShoot.getY() >= -20) {
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