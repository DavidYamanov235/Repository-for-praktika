package ru.yamanov.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static ru.yamanov.marathon.util.Manager.showFiveStage;
import static ru.yamanov.marathon.util.Manager.showThirStage;

public class FourController {
    String e, p, p1, name, surname, data;

    @FXML
    private Button BackButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField dataTexField;

    @FXML
    private TextField emailTexField;

    @FXML
    private Button goButton;

    @FXML
    private TextField nameTexField;

    @FXML
    private TextField passwordTexField;

    @FXML
    private TextField repeatepasswordlTexField;

    @FXML
    private TextField surnameTexField;

    @FXML
    void BackButtonOnAction(ActionEvent event) {
        showThirStage("scene3.fxml", "Марафон");

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
      e="";
      p=" ";
      p1=" ";
      name=" ";
      surname=" ";
      data=" ";

    }

    @FXML
    void goButton(ActionEvent event) {
        e = emailTexField.getText();
        p = passwordTexField.getText();
        p1 = repeatepasswordlTexField.getText();
        name = nameTexField.getText();
        surname = surnameTexField.getText();
        data = dataTexField.getText();
        showFiveStage("scene5.fxml", "Марафон");
    }

}
