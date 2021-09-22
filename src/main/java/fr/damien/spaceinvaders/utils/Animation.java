package fr.damien.spaceinvaders.utils;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Animation {

    public static void animateLogoSpaceInvaders(ImageView imgLogo, double fromY, double toY, int delay, double fromValue, double toValue, int fadeDuration ) {
        TranslateTransition animation = new TranslateTransition(Duration.millis(delay), imgLogo);
        animation.setFromY(fromY);
        animation.setToY(toY);
        animation.setInterpolator(Interpolator.EASE_OUT);
        animation.play();

        FadeTransition fade = new FadeTransition(Duration.millis(fadeDuration), imgLogo);
        fade.setFromValue(fromValue);
        fade.setToValue(toValue);
        fade.play();
    }

}
