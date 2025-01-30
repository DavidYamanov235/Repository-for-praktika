package ru.yamanov.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.yamanov.marathon.util.Manager.*;

public class ThirController {

    @FXML
    private Button backButton;

    @FXML
    private Button goButton;

    @FXML
    void BackButtonOnAction(ActionEvent event) {
        showSecondStage("scene3.fxml", "Марафон");

    }

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showFourStage("scene4.fxml", "Марафон");


    }

}
