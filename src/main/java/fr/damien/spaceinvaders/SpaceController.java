package fr.damien.spaceinvaders;

import fr.damien.spaceinvaders.entities.Ship;
import fr.damien.spaceinvaders.utils.Initialisation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class SpaceController {

    private Ship ship;

    @FXML
    private Pane board;

    @FXML
    private Label lblEndGam, lblScore;

    @FXML
    void onStartAction() {

        board.requestFocus();
        Initialisation.initShip(ship, board);
    }

    @FXML
    void onStopAction() {

    }
}