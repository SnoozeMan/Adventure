package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class AdventureController {

    @FXML
    private VBox vBox;
    @FXML
    private GridPane gridPaneUpper;
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private TextFlow textFlow;
    @FXML
    private GridPane gridPaneLower;
    @FXML
    private TextField textField;

    @FXML
    public void initialize() {
        vBox.setVgrow(gridPaneUpper, Priority.ALWAYS);
        //borderPane.setVgrow(scrollPane, Priority.ALWAYS);
        //borderPane.getTop().
    }

    @FXML
    public void onEnter(ActionEvent actionEvent) {
        //textFlow.setTextAlignment(TextAlignment.CENTER);
        Text text = new Text(textField.getText() + "\n");
        //text.setTextOrigin(VPos.TOP);
        textFlow.getChildren().add(text);
        textField.clear();
    }
}