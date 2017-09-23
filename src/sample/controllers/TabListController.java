package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class TabListController extends VBox {
    public TabListController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/tablist.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
