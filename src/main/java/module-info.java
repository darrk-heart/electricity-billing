module com.project.groupwork {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.project.groupwork to javafx.fxml;
    exports com.project.groupwork;
}