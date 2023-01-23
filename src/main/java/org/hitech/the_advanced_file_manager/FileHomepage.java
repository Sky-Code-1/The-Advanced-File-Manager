package org.hitech.the_advanced_file_manager;
/**
 * The file homepage class is loads the first page that
 * is displayed anytime the application executed
 * this homepage is designed in a way that it calls an
 * fxml file from the resource folder that contains the
 * scene that would be displayed to the user.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FileHomepage extends Application {
    Stage stage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(FileHomepage.class.getResource("file_manager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Advanced File Manager");
        stage.setScene(scene);
        stage.show();
    }
}
