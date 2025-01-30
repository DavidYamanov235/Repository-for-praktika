package ru.yamanov.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.yamanov.marathon.util.Manager.*;

public class SecondController {

    @FXML
    private Button BackButton;

    @FXML
    private Button goButton;

    @FXML
    private Button goButtonNew;

    @FXML
    void BackButtonOnAction(ActionEvent event) {
        showMainStage(mainStage, "scene1.fxml", "Марафон");

    }

    @FXML
    void goButtonNewOnAction(ActionEvent event) {
        showThirStage("scene3.fxml", "Марафон");

    }

    @FXML
    void goButtonOnActon(ActionEvent event) {

    }

}
