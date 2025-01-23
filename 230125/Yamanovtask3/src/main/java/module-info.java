module ru.yamanov.yamanovtask3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtask3 to javafx.fxml;
    exports ru.yamanov.yamanovtask3;
}