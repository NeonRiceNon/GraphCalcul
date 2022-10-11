package com.example.graphcalcul;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("../../../../resources/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 275);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Hello!");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}