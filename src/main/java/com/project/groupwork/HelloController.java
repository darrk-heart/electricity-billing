package com.project.groupwork;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button btnsignin;

    @FXML
    private Hyperlink hypsignup;

    @FXML
    private Hyperlink hyppasswd;

    @FXML
    private TextField tfemail;

    @FXML
    private PasswordField tfpassword;

    @FXML
    private Stage stage;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;

    @FXML
    public void btnsignin(ActionEvent event) throws IOException {
    //Button was clicked, do something...
        //if
    root = FXMLLoader.load(getClass().getResource("startpage.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();}

    public void hypsignup(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
    public void hyppasswd(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("forgetpasswd.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}