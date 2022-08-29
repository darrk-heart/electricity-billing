package com.project.groupwork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350.0, 450.0);
        stage.setTitle("BILLING SYSTEM!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {launch();}
}

