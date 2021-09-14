package fr.damien.spaceinvaders.entities;

import javafx.scene.paint.ImagePattern;

public class Brick extends Entity {

    public Brick(double x, double y, double width, double height, ImagePattern sprite) {
        super(x, y, width, height);
        super.setImgPattern(sprite);
        super.setFill(super.getImgPattern());
    }


}
