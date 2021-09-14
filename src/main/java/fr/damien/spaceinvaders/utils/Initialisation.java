package fr.damien.spaceinvaders.utils;

import fr.damien.spaceinvaders.entities.Ship;
import fr.damien.spaceinvaders.entities.ShipShoot;
import javafx.scene.layout.Pane;

public class Initialisation {

    public static void initShip(Ship ship, Pane board) {
        board.getChildren().add(ship);
    }

    public static void initShipShoot(ShipShoot shipShoot, Pane board) {

        board.getChildren().add(shipShoot);
    }
}
