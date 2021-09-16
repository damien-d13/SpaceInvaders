module fr.damien.spaceinvaders {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;


    opens fr.damien.spaceinvaders to javafx.fxml;
    exports fr.damien.spaceinvaders;
}