package fr.damien.spaceinvaders.entities;

import fr.damien.spaceinvaders.utils.Images;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Explosion {

    private static final Group explosionAliens = new Group();
    private static final Group explosionShoot = new Group();
    private static final Group explosionShip = new Group();

    public Explosion() {

    }

    public static Group explode() {

        final ImageView ex1 = new ImageView(Images.EX1);
        ex1.setFitWidth(50);
        ex1.setFitHeight(50);

        final ImageView ex2 = new ImageView(Images.EX2);
        ex2.setFitWidth(50);
        ex2.setFitHeight(50);

        final ImageView ex3 = new ImageView(Images.EX3);
        ex3.setFitWidth(50);
        ex3.setFitHeight(50);

        final ImageView ex4 = new ImageView(Images.EX4);
        ex4.setFitWidth(50);
        ex4.setFitHeight(50);

        final ImageView ex5 = new ImageView(Images.EX5);
        ex5.setFitWidth(50);
        ex5.setFitHeight(50);

        final ImageView ex6 = new ImageView(Images.EX6);
        ex6.setFitWidth(50);
        ex6.setFitHeight(50);

        final ImageView ex7 = new ImageView(Images.EX7);
        ex7.setFitWidth(50);
        ex7.setFitHeight(50);

        final ImageView ex8 = new ImageView(Images.EX8);
        ex8.setFitWidth(30);
        ex8.setFitHeight(30);

        KeyFrame kf1 = new KeyFrame(Duration.millis(80), actionEvent -> explosionAliens.getChildren().setAll(ex1));

        KeyFrame kf2 = new KeyFrame(Duration.millis(160), actionEvent -> explosionAliens.getChildren().setAll(ex2));

        KeyFrame kf3 = new KeyFrame(Duration.millis(240), actionEvent -> explosionAliens.getChildren().setAll(ex3));

        KeyFrame kf4 = new KeyFrame(Duration.millis(320), actionEvent -> explosionAliens.getChildren().setAll(ex4));

        KeyFrame kf5 = new KeyFrame(Duration.millis(400), actionEvent -> explosionAliens.getChildren().setAll(ex5));

        KeyFrame kf6 = new KeyFrame(Duration.millis(480), actionEvent -> explosionAliens.getChildren().setAll(ex6));

        KeyFrame kf7 = new KeyFrame(Duration.millis(560), actionEvent -> explosionAliens.getChildren().setAll(ex7));

        KeyFrame kf8 = new KeyFrame(Duration.millis(650), actionEvent -> explosionAliens.getChildren().setAll(ex8));

        Timeline timeline = new Timeline();
//        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7, kf8);
        timeline.play();

        return explosionAliens;
    }

    public static Group explodeShoot() {

        final ImageView exShoot1 = new ImageView(Images.EX_SHOOT_1);
        exShoot1.setFitWidth(30);
        exShoot1.setFitHeight(30);

        final ImageView exShoot2 = new ImageView(Images.EX_SHOOT_2);
        exShoot2.setFitWidth(30);
        exShoot2.setFitHeight(30);

        final ImageView exShoot3 = new ImageView(Images.EX_SHOOT_3);
        exShoot3.setFitWidth(30);
        exShoot3.setFitHeight(30);

        final ImageView exShoot4 = new ImageView(Images.EX_SHOOT_4);
        exShoot4.setFitWidth(30);
        exShoot4.setFitHeight(30);

        final ImageView exShoot5 = new ImageView(Images.EX_SHOOT_5);
        exShoot5.setFitWidth(30);
        exShoot5.setFitHeight(30);

        final ImageView exShoot6 = new ImageView(Images.EX_SHOOT_6);
        exShoot6.setFitWidth(30);
        exShoot6.setFitHeight(30);

        final ImageView exShoot7 = new ImageView(Images.EX_SHOOT_7);
        exShoot7.setFitWidth(30);
        exShoot7.setFitHeight(30);



        KeyFrame kf1 = new KeyFrame(Duration.millis(80), actionEvent -> explosionShoot.getChildren().setAll(exShoot1));

        KeyFrame kf2 = new KeyFrame(Duration.millis(160), actionEvent -> explosionShoot.getChildren().setAll(exShoot2));

        KeyFrame kf3 = new KeyFrame(Duration.millis(240), actionEvent -> explosionShoot.getChildren().setAll(exShoot3));

        KeyFrame kf4 = new KeyFrame(Duration.millis(320), actionEvent -> explosionShoot.getChildren().setAll(exShoot4));

        KeyFrame kf5 = new KeyFrame(Duration.millis(400), actionEvent -> explosionShoot.getChildren().setAll(exShoot5));

        KeyFrame kf6 = new KeyFrame(Duration.millis(480), actionEvent -> explosionShoot.getChildren().setAll(exShoot6));

        KeyFrame kf7 = new KeyFrame(Duration.millis(560), actionEvent -> explosionShoot.getChildren().setAll(exShoot7));



        Timeline timeline = new Timeline();
//        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7);
        timeline.play();

        return explosionShoot;
    }

    public static Group explodeShip() {

        final ImageView exShip1 = new ImageView(Images.EX_SHIP_1);
        exShip1.setFitWidth(50);
        exShip1.setFitHeight(50);

        final ImageView exShip2 = new ImageView(Images.EX_SHIP_2);
        exShip2.setFitWidth(50);
        exShip2.setFitHeight(50);

        final ImageView exShip3 = new ImageView(Images.EX_SHIP_3);
        exShip3.setFitWidth(50);
        exShip3.setFitHeight(50);

        final ImageView exShip4 = new ImageView(Images.EX_SHIP_4);
        exShip4.setFitWidth(50);
        exShip4.setFitHeight(50);

        final ImageView exShip5 = new ImageView(Images.EX_SHIP_5);
        exShip5.setFitWidth(50);
        exShip5.setFitHeight(50);

        final ImageView exShip6 = new ImageView(Images.EX_SHIP_6);
        exShip6.setFitWidth(50);
        exShip6.setFitHeight(50);

        final ImageView exShip7 = new ImageView(Images.EX_SHIP_7);
        exShip7.setFitWidth(50);
        exShip7.setFitHeight(50);

        final ImageView exShip8 = new ImageView(Images.EX_SHIP_8);
        exShip8.setFitWidth(50);
        exShip8.setFitHeight(50);


        final ImageView exShip9 = new ImageView(Images.EX_SHIP_9);
        exShip6.setFitWidth(50);
        exShip6.setFitHeight(50);

        final ImageView exShip10 = new ImageView(Images.EX_SHIP_10);
        exShip7.setFitWidth(50);
        exShip7.setFitHeight(50);

        final ImageView exShip11 = new ImageView(Images.EX_SHIP_11);
        exShip8.setFitWidth(50);
        exShip8.setFitHeight(50);


        KeyFrame kf1 = new KeyFrame(Duration.millis(80), actionEvent -> explosionShip.getChildren().setAll(exShip1));

        KeyFrame kf2 = new KeyFrame(Duration.millis(160), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip2);
            }
        });

        KeyFrame kf3 = new KeyFrame(Duration.millis(240), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip3);
            }
        });

        KeyFrame kf4 = new KeyFrame(Duration.millis(320), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip4);
            }
        });

        KeyFrame kf5 = new KeyFrame(Duration.millis(400), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip5);
            }
        });

        KeyFrame kf6 = new KeyFrame(Duration.millis(480), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip6);
            }
        });

        KeyFrame kf7 = new KeyFrame(Duration.millis(560), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip7);
            }
        });

        KeyFrame kf8 = new KeyFrame(Duration.millis(650), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip8);
            }
        });

        KeyFrame kf9 = new KeyFrame(Duration.millis(740), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip9);
            }
        });

        KeyFrame kf10 = new KeyFrame(Duration.millis(830), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip10);
            }
        });

        KeyFrame kf11 = new KeyFrame(Duration.millis(920), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(exShip11);
            }
        });

        Timeline timeline = new Timeline();
//        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7, kf8, kf9, kf10, kf11);
        timeline.play();

        return explosionShip;
    }


}
