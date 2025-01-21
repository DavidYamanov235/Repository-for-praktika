package ru.yamanov.yamanovtaskdop1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Label kvLabel;

    @FXML
    private Button searchButton;

    @FXML
    private Label svLabel;

    @FXML
    void searchOnAction(ActionEvent event) {
        int A=Integer.parseInt(ATextField.getText());
        int B=Integer.parseInt(BTextField.getText());
        int C=Integer.parseInt(CTextField.getText());
        int p1=A*B;
        int p2=C*C;
        int colv=p1/p2;
        int sv=p1-colv;
        kvLabel.setText(String.valueOf(colv));
        svLabel.setText(String.valueOf(sv));
    }

}
