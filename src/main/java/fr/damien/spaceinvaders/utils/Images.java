package fr.damien.spaceinvaders.utils;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class Images {

    public final static String PATH = "FILE:./src/main/resources/fr/damien/spaceinvaders/images/";

    public final static Image SHIP = new Image(PATH + "vaisseau.png");
    public final static Image SHIP_SHOOT = new Image(PATH + "ship1Shoot.png");

    private final static Image IMG_BRICK_1 = new Image(PATH + "wall1.png");
    private final static Image IMG_BRICK_2 = new Image(PATH + "wall2.png");
    private final static Image IMG_BRICK_3 = new Image(PATH + "wall3.png");
    private final static Image IMG_BRICK_4 = new Image(PATH + "wall4.png");

    public final static ImagePattern BRICK_1 = new ImagePattern(IMG_BRICK_1);
    public final static ImagePattern BRICK_2 = new ImagePattern(IMG_BRICK_2);
    public final static ImagePattern BRICK_3 = new ImagePattern(IMG_BRICK_3);
    public final static ImagePattern BRICK_4 = new ImagePattern(IMG_BRICK_4);

    public final static Image ALIEN_HIGH_1 = new Image(PATH + "alienHigh1.png");
    public final static Image ALIEN_HIGH_2 = new Image(PATH + "alienHigh2.png");
    public final static Image ALIEN_MIDDLE_1 = new Image(PATH + "alienMiddle1.png");
    public final static Image ALIEN_MIDDLE_2 = new Image(PATH + "alienMiddle2.png");
    public final static Image ALIEN_BOTTOM_1 = new Image(PATH + "alienBottom1.png");
    public final static Image ALIEN_BOTTOM_2 = new Image(PATH + "alienBottom2.png");

    public final static Image EX1 = new Image(PATH + "explosion1.png");
    public final static Image EX2 = new Image(PATH + "explosion2.png");
    public final static Image EX3 = new Image(PATH + "explosion3.png");
    public final static Image EX4 = new Image(PATH + "explosion4.png");
    public final static Image EX5 = new Image(PATH + "explosion5.png");
    public final static Image EX6 = new Image(PATH + "explosion6.png");
    public final static Image EX7 = new Image(PATH + "explosion7.png");

}
