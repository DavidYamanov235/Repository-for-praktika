package ru.yamanov.yamanovtask5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField PTextField;

    @FXML
    private Label mounthLabel;

    @FXML
    private Button searchButton;

    @FXML
    private Label summLabel;

    @FXML
    void SearchOnAction(ActionEvent event) {
        double P=Double.parseDouble(PTextField.getText());
        double S=1000;
        int k=0;
        while (S<=1100) {
            S = S+(S * P) / 100;

            k++;
        }
        summLabel.setText(String.valueOf(S));
        mounthLabel.setText(String.valueOf(k));

    }

}
