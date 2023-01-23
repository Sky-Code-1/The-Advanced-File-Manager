package org.hitech.the_advanced_file_manager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.File;
import java.util.ArrayList;

public class FileHomepageController {
    @FXML
    private Button documents;
    @FXML
    private Button videos;
    @FXML
    private Button audio;
    @FXML
    private Button others;
    @FXML
    private Button fileDirectory;
    @FXML
    private Button selectGroup;
    @FXML
    private ListView<File> filesAndFolders;

    public ArrayList<File> searchFiles(String type){
        ArrayList<File> files = new ArrayList<>();

        return files;
    }

}
