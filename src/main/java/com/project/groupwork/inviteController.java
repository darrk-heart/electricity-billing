package com.project.groupwork;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;
import java.awt.Desktop;
import java.net.URISyntaxException;

import java.io.IOException;
import java.net.URI;

public class inviteController {
    @FXML
    private Hyperlink hypback;

    @FXML
    private Hyperlink hypinvitefrd;

    @FXML
    private Button invite;



    private Stage stage;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;

    @FXML
    public void hypback(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("startpage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
}