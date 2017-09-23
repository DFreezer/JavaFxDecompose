package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class MainController extends HBox{
    public MainController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
