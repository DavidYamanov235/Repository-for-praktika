package ru.yamanov.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.yamanov.marathon.util.Manager.*;

public class SixController {

    @FXML
    private Button backButton;

    @FXML
    private Button goButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showFiveStage("scene5.fxml", "Марафон");
    }

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSevenStage("scene7.fxml", "Марафон");

    }

}
