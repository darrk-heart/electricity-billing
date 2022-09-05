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

public class forgotpasswdController {
    @FXML
    private Hyperlink hypback;
    @FXML
    private TextField tfemail;
    @FXML
    private Button btnforgotpasswd;




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

    @FXML
    public void btnforgotpasswd(ActionEvent event) throws IOException {
        String email = tfemail.getText();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Password Reset Link sent to your Mail. ");
        alert.setHeaderText(null);
        alert.showAndWait();
}}