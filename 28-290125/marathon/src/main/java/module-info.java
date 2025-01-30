module ru.yamanov.marathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.marathon to javafx.fxml;
    exports ru.yamanov.marathon;
    exports ru.yamanov.marathon.controller;
    opens ru.yamanov.marathon.controller to javafx.fxml;
}