package fr.damien.spaceinvaders.utils;

import fr.damien.spaceinvaders.entities.Alien;
import fr.damien.spaceinvaders.entities.Brick;
import fr.damien.spaceinvaders.entities.Ship;
import fr.damien.spaceinvaders.entities.ShipShoot;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class Initialisation {

    public static void initShip(Ship ship, Pane board) {
        board.getChildren().add(ship);
    }

    public static void initShipShoot(ShipShoot shipShoot, Pane board) {

        board.getChildren().add(shipShoot);
    }

    public static void initWalls(int x, int y, int xNextLine, List<Brick> walls, Pane board) {

        for (int i = 0; i <= 3; i++ ) {
            for (int j = 0; j <= 6; j++) {
                walls.add(new Brick(x, y, Constants.BRICK_WIDTH, Constants.BRICK_HEIGHT, Brick.setRandomBrick()));
                x += 10;
            }

            x = xNextLine;
            y += 10;
        }
        for (int i = 0; i <= 3; i++ ) {
            for (int j = 0; j <= 6; j++) {
                walls.add(new Brick(x + 120, y - 40, Constants.BRICK_WIDTH, Constants.BRICK_HEIGHT, Brick.setRandomBrick()));
                x += 10;
            }

            x = xNextLine;
            y += 10;
        }
        for (int i = 0; i <= 3; i++ ) {
            for (int j = 0; j <= 6; j++) {
                walls.add(new Brick(x + 240, y - 80, Constants.BRICK_WIDTH, Constants.BRICK_HEIGHT, Brick.setRandomBrick()));
                x += 10;
            }

            x = xNextLine;
            y += 10;
        }
        for (int i = 0; i <= 3; i++ ) {
            for (int j = 0; j <= 6; j++) {
                walls.add(new Brick(x + 360, y - 120, Constants.BRICK_WIDTH, Constants.BRICK_HEIGHT, Brick.setRandomBrick()));
                x += 10;
            }

            x = xNextLine;
            y += 10;
        }
        board.getChildren().addAll(walls);

    }

    public static void initAliens(Alien[][] aliens, Pane board) {
        for (int column = 0; column < 10; column++) {
            aliens[0][column] = new Alien(Constants.X_POS_INIT_ALIEN +
                    (Constants.ALIEN_WIDTH + Constants.GAP_COLUMNS_ALIEN) * column,
                    Constants.Y_POS_INIT_ALIEN , Constants.ALIEN_WIDTH, Constants.ALIEN_HEIGHT, Images.ALIEN_HIGH_1, 3 );
            for (int line = 1; line < 3; line++) {
                aliens[line][column] = new Alien(Constants.X_POS_INIT_ALIEN +
                        (Constants.ALIEN_WIDTH + Constants.GAP_COLUMNS_ALIEN) * column,
                        Constants.Y_POS_INIT_ALIEN + (Constants.ALIEN_HEIGHT + Constants.GAP_LINES_ALIEN ) * line,
                        Constants.ALIEN_WIDTH, Constants.ALIEN_HEIGHT, Images.ALIEN_MIDDLE_1, 2 );
            }
            for (int line = 3; line < 5; line++) {
                aliens[line][column] = new Alien(Constants.X_POS_INIT_ALIEN +
                        (Constants.ALIEN_WIDTH + Constants.GAP_COLUMNS_ALIEN) * column,
                        Constants.Y_POS_INIT_ALIEN + (Constants.ALIEN_HEIGHT + Constants.GAP_LINES_ALIEN ) * line, Constants.ALIEN_WIDTH ,
                        Constants.ALIEN_HEIGHT, Images.ALIEN_BOTTOM_1, 1 );
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++) {
                board.getChildren().addAll(aliens[i][j]);
            }
        }

    }

    public static void initExplosion(Group groupExplosion, Pane board) {
        board.getChildren().add(groupExplosion);
    }

    public static void initSaucer100(Rectangle saucer100Rect, Pane board) {
        saucer100Rect.setWidth(Constants.SAUCER_WIDTH);
        saucer100Rect.setHeight(Constants.SHIP_HEIGHT);
        ImagePattern saucer100 = new ImagePattern(Images.SAUCER_100);
        saucer100Rect.setFill(saucer100);
        //Initial position out Pane
        saucer100Rect.setX(Constants.X_POS_SAUCER_SCORE);
        saucer100Rect.setY(Constants.Y_POS_SAUCER_SCORE);
        board.getChildren().add(saucer100Rect);
    }
}
