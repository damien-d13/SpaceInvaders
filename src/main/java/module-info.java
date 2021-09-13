module fr.damien.spaceinvaders {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens fr.damien.spaceinvaders to javafx.fxml;
    exports fr.damien.spaceinvaders;
}