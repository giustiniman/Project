module com.example.pcb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.pcb to javafx.fxml;
    exports com.example.pcb;
    exports com.example.pcb.BeanClass;
    opens com.example.pcb.BeanClass to javafx.fxml;
    exports com.example.pcb.DaoClass;
    opens com.example.pcb.DaoClass to javafx.fxml;
}