module view {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens view to javafx.fxml;
    exports view;
    opens controller to javafx.fxml;
    exports controller;
}