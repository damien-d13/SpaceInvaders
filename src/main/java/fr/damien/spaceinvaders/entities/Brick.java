package fr.damien.spaceinvaders.entities;

import fr.damien.spaceinvaders.utils.Images;
import javafx.scene.paint.ImagePattern;

import java.util.ArrayList;
import java.util.Random;

public class Brick extends Entity {

    private static ArrayList<ImagePattern> randomWall = new ArrayList<>();

    private static Random random = new Random();

    public Brick(double x, double y, double width, double height, ImagePattern sprite) {
        super(x, y, width, height);
        super.setImgPattern(sprite);
        super.setFill(super.getImgPattern());
    }

    public static ImagePattern setRandomBrick() {
        randomWall.add(Images.BRICK_1);
        randomWall.add(Images.BRICK_2);
        randomWall.add(Images.BRICK_3);
        randomWall.add(Images.BRICK_4);
        int index = random.nextInt(randomWall.size());
        return randomWall.get(index);
    }

}
