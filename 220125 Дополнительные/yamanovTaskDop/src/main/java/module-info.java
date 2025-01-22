module ru.yamanov.yamanovtaskdop {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtaskdop to javafx.fxml;
    exports ru.yamanov.yamanovtaskdop;
}