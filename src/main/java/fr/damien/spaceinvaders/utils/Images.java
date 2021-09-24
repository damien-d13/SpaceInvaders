package fr.damien.spaceinvaders.utils;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public interface Images {

     String PATH = "FILE:./src/main/resources/fr/damien/spaceinvaders/images/";

     Image SHIP = new Image(PATH + "vaisseau.png");
     Image SHIP_SHOOT = new Image(PATH + "ship1Shoot.png");

     Image IMG_BRICK_1 = new Image(PATH + "wall1.png");
     Image IMG_BRICK_2 = new Image(PATH + "wall2.png");
     Image IMG_BRICK_3 = new Image(PATH + "wall3.png");
     Image IMG_BRICK_4 = new Image(PATH + "wall4.png");

     ImagePattern BRICK_1 = new ImagePattern(IMG_BRICK_1);
     ImagePattern BRICK_2 = new ImagePattern(IMG_BRICK_2);
     ImagePattern BRICK_3 = new ImagePattern(IMG_BRICK_3);
     ImagePattern BRICK_4 = new ImagePattern(IMG_BRICK_4);

     Image ALIEN_HIGH_1 = new Image(PATH + "alienHigh1.png");
     Image ALIEN_HIGH_2 = new Image(PATH + "alienHigh2.png");
     Image ALIEN_MIDDLE_1 = new Image(PATH + "alienMiddle1.png");
     Image ALIEN_MIDDLE_2 = new Image(PATH + "alienMiddle2.png");
     Image ALIEN_BOTTOM_1 = new Image(PATH + "alienBottom1.png");
     Image ALIEN_BOTTOM_2 = new Image(PATH + "alienBottom2.png");

     Image EX1 = new Image(PATH + "ExShoot1.png");
     Image EX2 = new Image(PATH + "ExShoot2.png");
     Image EX3 = new Image(PATH + "ExShoot3.png");
     Image EX4 = new Image(PATH + "ExShoot4.png");
     Image EX5 = new Image(PATH + "ExShoot5.png");
     Image EX6 = new Image(PATH + "ExShoot6.png");
     Image EX7 = new Image(PATH + "ExShoot7.png");
     Image EX8 = new Image(PATH + "ExShoot8.png");

     Image EX_SHOOT_1 = new Image(PATH + "explosion1.png");
     Image EX_SHOOT_2 = new Image(PATH + "explosion2.png");
     Image EX_SHOOT_3 = new Image(PATH + "explosion3.png");
     Image EX_SHOOT_4 = new Image(PATH + "explosion4.png");
     Image EX_SHOOT_5 = new Image(PATH + "explosion5.png");
     Image EX_SHOOT_6 = new Image(PATH + "explosion6.png");
     Image EX_SHOOT_7 = new Image(PATH + "explosion7.png");


     Image EX_SHIP_1 = new Image(PATH + "ExShip1.png");
     Image EX_SHIP_2 = new Image(PATH + "ExShip2.png");
     Image EX_SHIP_3 = new Image(PATH + "ExShip3.png");
     Image EX_SHIP_4 = new Image(PATH + "ExShip4.png");
     Image EX_SHIP_5 = new Image(PATH + "ExShip5.png");
     Image EX_SHIP_6 = new Image(PATH + "ExShip6.png");
     Image EX_SHIP_7 = new Image(PATH + "ExShip7.png");
     Image EX_SHIP_8 = new Image(PATH + "ExShip8.png");
     Image EX_SHIP_9 = new Image(PATH + "ExShip9.png");
     Image EX_SHIP_10 = new Image(PATH + "ExShip10.png");
     Image EX_SHIP_11 = new Image(PATH + "ExShip11.png");

     Image ALIEN_SHOOT = new Image(PATH + "aliensShoot2.png");

     Image SAUCER = new Image(PATH + "saucer.png");
     Image SAUCER_100 = new Image(PATH + "saucer100.png");

}
