package org.hitech.the_advanced_file_manager;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
    private Button browse;
    @FXML
    private VBox filesVBox;
    @FXML
    private TextField pathTextField;
    @FXML
    private Label numberOfFiles, numberOfFolders, folderSize;

    public ArrayList<Label> fileLabels = new ArrayList<>();

    @FXML
    public ArrayList<File> searchFiles(String path) throws Exception{
        ArrayList<File> files = new ArrayList<>();
        try {
            filesVBox.getChildren().clear();
            File[] listedFiles;
            File fileInPath = new File(path);
            long sizeOfFolder = fileInPath.length();
            listedFiles = fileInPath.listFiles();
            for (File f : listedFiles) {
                files.add(f);
                filesVBox.getChildren().add(new Label( "   " + f.getName()));
                folderSize.setText("Total size   : " + sizeOfFolder/1000 + "MB");
            }
        }
       catch (Exception e){
           System.out.println(e.getMessage());
           Platform.exit();
       }
        return files;
    }
//    public void showFiles(String path) throws Exception{
//        ArrayList<File> files = searchFiles(path);
//        for(File file: files){
//
//        }
//    }
    @FXML
    public void onAnyButtonClick(ActionEvent e) throws Exception{
        searchFiles(pathTextField.getText().toString());
    }
}
