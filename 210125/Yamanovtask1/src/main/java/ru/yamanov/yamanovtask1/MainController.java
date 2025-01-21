package ru.yamanov.yamanovtask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField LTextField;

    @FXML
    private Label RezultLabel;

    @FXML
    private Button SearchButton;

    @FXML
    void SearchOnAction(ActionEvent event) {
        int L=Integer.parseInt(LTextField.getText());
        int R=L/100;
        RezultLabel.setText("Полных метров:"+""+R);

    }

}
