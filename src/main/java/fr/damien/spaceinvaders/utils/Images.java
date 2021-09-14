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




}
