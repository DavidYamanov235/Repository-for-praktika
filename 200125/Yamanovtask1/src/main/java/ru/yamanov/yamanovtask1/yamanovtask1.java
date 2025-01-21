package ru.yamanov.yamanovtask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class yamanovtask1 {

    @FXML
    private TextField ChicloTextField;

    @FXML
    private Button SearchButton;

    @FXML
    private Label rezultLabel;

    @FXML
    private Label sideALabel;

    @FXML
    void SearchOnAction(ActionEvent event) {
        double A=Double.parseDouble(ChicloTextField.getText());
        double P=A*4;
        rezultLabel.setText(String.valueOf(P));
    }

}
