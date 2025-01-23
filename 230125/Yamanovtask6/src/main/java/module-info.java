module ru.yamanov.yamanovtask6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtask6 to javafx.fxml;
    exports ru.yamanov.yamanovtask6;
}