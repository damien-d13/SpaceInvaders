package fr.damien.spaceinvaders.entities;

import fr.damien.spaceinvaders.utils.Constants;
import fr.damien.spaceinvaders.utils.Utility;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class Alien extends Entity{

    private static boolean goRight = true;
    private static boolean alienPosition = true;

    private static int speed = Constants.ALIEN_SPEED;

    private static int type;

    private boolean isDead;


    public Alien(double x, double y, double width, double height, Image image) {
        super(x, y, width, height);
        super.setImg(image);
        super.setImgPattern(new ImagePattern(super.getImg()));
        super.setFill(super.getImgPattern());
        this.isDead = false;
    }

    public Alien(double x, double y, double width, double height, Image image, int type) {
        super(x, y, width, height);
        super.setImg(image);
        super.setImgPattern(new ImagePattern(super.getImg()));
        super.setFill(super.getImgPattern());
        this.type = type;
    }

    public static void aliensMoving(Alien[][] aliens) {

        if(goRight) {
            for (int column = 0; column < 10; column++) {
                for (int line = 0; line < 5; line++) {
                    aliens[line][column].setX(aliens[line][column].getX() + Constants.ALIEN_DELTA_X);
                }
            }

        } else {
            for (int column = 0; column < 10; column++) {
                for (int line = 0; line < 5; line++) {
                    aliens[line][column].setX(aliens[line][column].getX() - Constants.ALIEN_DELTA_X);
                }
            }
        }
        int imageNumber;
        if (alienPosition) {
            imageNumber = 2;
            alienPosition = false;
        } else {
            imageNumber = 1;
            alienPosition = true;
        }
        aliensMovingIntoBoard(aliens);

        Utility.displayAlternateAlienImage(aliens, imageNumber);

    }

    public static void aliensMovingIntoBoard(Alien[][] aliens) {
        if (Utility.aliensTouchRightSide(aliens)) {
            for (int column = 0; column < 10; column++) {
                for (int line = 0; line < 5; line++) {
                    aliens[line][column].setY(aliens[line][column].getY() + Constants.ALIEN_DELTA_Y);
                }
            }
            goRight = false;
            if(Alien.getSpeed() < 9) {
                Alien.setSpeed(Alien.getSpeed() + 1);
            }


        } else if (Utility.aliensTouchLeftSide(aliens)) {
            for (int column = 0; column < 10; column++) {
                for (int line = 0; line < 5; line++) {
                    aliens[line][column].setY(aliens[line][column].getY() + Constants.ALIEN_DELTA_Y);
                }
            }
            goRight = true;
            if(Alien.getSpeed() < 9) {
                Alien.setSpeed(Alien.getSpeed() + 1);
            }
        }


    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Alien.speed = speed;
    }

    public static int getType() {
        return type;
    }


    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

}
