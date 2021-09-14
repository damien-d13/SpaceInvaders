package fr.damien.spaceinvaders.utils;

import fr.damien.spaceinvaders.entities.Brick;
import fr.damien.spaceinvaders.entities.Ship;
import fr.damien.spaceinvaders.entities.ShipShoot;
import javafx.scene.layout.Pane;

import java.util.List;

public class Initialisation {

    public static void initShip(Ship ship, Pane board) {
        board.getChildren().add(ship);
    }

    public static void initShipShoot(ShipShoot shipShoot, Pane board) {

        board.getChildren().add(shipShoot);
    }

    public static void initWalls(int x, int y, int xNextLine, List<Brick> walls, Pane board) {

        for (int i = 0; i <= 3; i++ ) {
            for (int j = 0; j <= 6; j++) {
                walls.add(new Brick(x, y, Constants.BRICK_WIDTH, Constants.BRICK_HEIGHT, Images.BRICK_1));
                x += 10;
            }

            x = xNextLine;
            y += 10;
        }
        board.getChildren().addAll(walls);

    }
}
