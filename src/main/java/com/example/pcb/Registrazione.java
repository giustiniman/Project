package com.example.pcb;

import com.example.pcb.DaoClass.DaoLoginConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Objects;

public class Registrazione {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField firstnameTextField;

    @FXML
    private TextField lastnameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private TextField usernameTextField;


    public void switchToEntry(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Entry.fxml")));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToUserProfile(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("UserProfile.fxml")));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public void registerUser(ActionEvent event){

        Connection myConnection = DaoLoginConnection.getDBConnection();

        String firstname = firstnameTextField.getText();
        String lastname = lastnameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();
        String role = "User";


        String insertFields = "INSERT INTO useraccounts(firstname, lastname, username, password, Role) VALUES ('";
        String insertValues = firstname + "','" + lastname + "','" + username + "','"+ password + "','" + role + "')" ;
        String insertToRegister = insertFields + insertValues;

        try{

            Statement statement = myConnection.createStatement();
            statement.executeUpdate(insertToRegister);
            switchToUserProfile(event);

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }



    }

}
