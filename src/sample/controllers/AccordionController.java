package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Accordion;

import java.io.IOException;

public class AccordionController extends Accordion {
    public AccordionController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/accordion.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
