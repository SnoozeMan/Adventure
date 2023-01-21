package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Adventure extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        buildGUI(stage);
    }

    private void buildGUI(Stage stage) throws IOException {
        // Load GUI properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("view.GUI");

        // Load fxml as parent
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent parent = fxmlLoader.load(getClass().getResource("Adventure.fxml"), resourceBundle);

        // Get screen dimensions
        int[] dimensions = getScreenDimensions();
        int width = dimensions[0];
        int height = dimensions[1];

        // Build scene
        Scene scene = new Scene(parent, width, height);
        scene.getStylesheets().add(getClass().getResource("Adventure.css").toExternalForm());

        // Build stage
        stage.setScene(scene);
        stage.setMinWidth(width);
        stage.setMinHeight(height);
        stage.setTitle("Adventure");
        stage.show();
    }

    private int[] getScreenDimensions() {
        //System.setProperty("java.awt.headless", "false"); // Turn off headless mode to get access to screen dimensions
        //Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        //screen.getWidth(), screen.getHeight()
        int width = 765; // OSRS screen size
        int height = 503;
        return new int[]{width, height};
    }
}