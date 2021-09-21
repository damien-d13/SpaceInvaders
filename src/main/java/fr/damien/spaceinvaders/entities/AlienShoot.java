package fr.damien.spaceinvaders.entities;

import fr.damien.spaceinvaders.utils.Constants;
import fr.damien.spaceinvaders.utils.Images;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;

import java.util.LinkedList;

public class AlienShoot extends Entity{


    public AlienShoot(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.ALIEN_SHOOT));
        super.setFill(super.getImgPattern());
    }

    public static void handleAliensShot(LinkedList<AlienShoot> alienShootList, Pane board) {

        // table one dimension only the variable change inside
        final AlienShoot[] tmp = new AlienShoot[1];

            alienShootList.forEach(shoot -> {
                if (shoot.getY() > Constants.WINDOW_HEIGHT) {
                    tmp[0] = shoot;

                } else {
                    shoot.setY(shoot.getY() + Constants.ALIEN_SHOOT_DELTA_Y);
                }
            });
        alienShootList.remove(tmp[0]);
        board.getChildren().remove(tmp[0]);


    }



}
