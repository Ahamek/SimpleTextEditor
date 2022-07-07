module TextModificator {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports app to javafx.graphics;
    opens controller to javafx.fxml;
}