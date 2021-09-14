package fr.damien.spaceinvaders.entities;


import fr.damien.spaceinvaders.utils.Images;
import javafx.scene.paint.ImagePattern;

public class ShipShoot extends Entity {

    public ShipShoot(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.SHIP_SHOOT));
        super.setFill(super.getImgPattern());
    }
}
