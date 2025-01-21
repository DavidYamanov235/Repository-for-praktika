module ru.yamanov.yamanovtask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtask2 to javafx.fxml;
    exports ru.yamanov.yamanovtask2;
}