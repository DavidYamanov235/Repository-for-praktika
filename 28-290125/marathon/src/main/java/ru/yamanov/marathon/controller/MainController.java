package ru.yamanov.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.yamanov.marathon.util.Manager.showSecondStage;

public class MainController implements Initializable {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSecondStage("scene2.fxml" ,"Марафон");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
