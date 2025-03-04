package ru.yamanov.marathon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.yamanov.marathon.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       showMainStage(stage, "scene1.fxml", "Марафон");
    }
    public static void main(String[] args) {
        launch();
    }
}