package fr.damien.spaceinvaders.entities;

import fr.damien.spaceinvaders.utils.Constants;
import fr.damien.spaceinvaders.utils.Images;
import fr.damien.spaceinvaders.utils.Sounds;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.ImagePattern;

public class Saucer extends Entity {



    private AudioClip saucerPassingSound = new AudioClip(Sounds.SAUCER_PASSING_SOUND);




    private boolean isDead;


    public Saucer(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.SAUCER));
        super.setFill(super.getImgPattern());
        this.saucerPassingSound.setVolume(0.02);
        this.saucerPassingSound.play();

        this.isDead = false;
    }

    public void saucerMoving(int deltaX) {
        if (super.getX() > - Constants.SAUCER_WIDTH && super.getX() < Constants.WINDOW_WIDTH + 1) {
            super.setX(super.getX() - deltaX);

        } else {

            this.saucerPassingSound.stop();
        }

    }

    public  AudioClip getSaucerPassingSound() {
        return saucerPassingSound;
    }

    public boolean isDead() {
        return isDead;
    }
    public void setDead(boolean dead) {
        isDead = dead;
    }
}
