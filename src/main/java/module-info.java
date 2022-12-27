module com.example.pcb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.pcb to javafx.fxml;
    exports com.example.pcb;
}