package fr.damien.spaceinvaders.entities;

import fr.damien.spaceinvaders.utils.Images;
import javafx.scene.paint.ImagePattern;

public class Ship extends Entity{

    private boolean shipIsShooting;

    public Ship(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.SHIP));
        super.setFill(super.getImgPattern());
        this.shipIsShooting = false;
    }
}
