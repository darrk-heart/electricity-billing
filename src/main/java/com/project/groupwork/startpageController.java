package com.project.groupwork;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class startpageController {

    @FXML
    private Button btnbillsandpay;

    @FXML
    private Button btnnoti;

    @FXML
    private Button btnaccountinfo;

    @FXML
    private Button btninvite;

    @FXML
    private Button btnlogout;

    @FXML
    private Button btnexit;


    @FXML
    private Stage stage;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;

    @FXML
    public void btnbillsandpay(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("billsandpays.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
    public void btnnoti(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("notifications.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
    public void btninvite(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("invitefriend.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
    public void btnaccountinfo(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("accountinfo.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
    public void btnlogout(ActionEvent event) throws IOException {
        //Button was clicked, do something...
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
    public void btnexit(ActionEvent event) throws IOException{
        System.exit(0);
    }

}
