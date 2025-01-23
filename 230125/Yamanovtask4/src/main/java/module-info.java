module ru.yamanov.yamanovtask4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtask4 to javafx.fxml;
    exports ru.yamanov.yamanovtask4;
}