package fr.damien.spaceinvaders.entities;

import fr.damien.spaceinvaders.utils.Constants;
import fr.damien.spaceinvaders.utils.Images;
import fr.damien.spaceinvaders.utils.Sounds;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.ImagePattern;

public class Saucer extends Entity {



    private AudioClip saucerPassingSound = new AudioClip(Sounds.SAUCER_PASSING_SOUND);
    private boolean isOnScreen;

    public Saucer(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.SAUCER));
        super.setFill(super.getImgPattern());
        this.saucerPassingSound.setVolume(0.02);
        this.saucerPassingSound.play();
        this.isOnScreen = false;
    }

    public void saucerMoving(int deltaX) {
        if (super.getX() > 0 - Constants.SAUCER_WIDTH && super.getX() < Constants.WINDOW_WIDTH + 1) {
            super.setX(super.getX() - deltaX);
            isOnScreen = true;
        } else {
            isOnScreen = false;
            this.saucerPassingSound.stop();
        }

    }

    public  AudioClip getSaucerPassingSound() {
        return saucerPassingSound;
    }
}
