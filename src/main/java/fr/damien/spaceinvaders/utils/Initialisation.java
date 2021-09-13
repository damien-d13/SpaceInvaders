package fr.damien.spaceinvaders.utils;

import fr.damien.spaceinvaders.entities.Ship;
import javafx.scene.layout.Pane;

public class Initialisation {

    public static void initShip(Ship ship, Pane board) {
        ship = new Ship(100,100, 30, 30);
        board.getChildren().add(ship);
    }
}
