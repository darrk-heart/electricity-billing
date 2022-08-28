module com.project.groupwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.groupwork to javafx.fxml;
    exports com.project.groupwork;
}