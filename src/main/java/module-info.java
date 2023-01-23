module org.hitech.the_advanced_file_manager {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hitech.the_advanced_file_manager to javafx.fxml;
    exports org.hitech.the_advanced_file_manager;
}