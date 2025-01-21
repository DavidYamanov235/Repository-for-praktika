module ru.yamanov.yamanovtaskdop1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtaskdop1 to javafx.fxml;
    exports ru.yamanov.yamanovtaskdop1;
}