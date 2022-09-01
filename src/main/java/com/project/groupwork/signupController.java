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

public class signupController {
    @FXML
    private Hyperlink hypback;
    @FXML
    private Button btnsignup;




    private Stage stage;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;

    @FXML
    public void hypback(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}

    public void btnsignup(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("You have succesfully created an account with us!!!");
        alert.setHeaderText(null);
        alert.showAndWait();}
}