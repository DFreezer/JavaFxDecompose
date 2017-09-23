package sample.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controllers.MainController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        MainController mainController = new MainController();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(mainController));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
