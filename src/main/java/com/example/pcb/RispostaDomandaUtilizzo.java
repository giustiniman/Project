package com.example.pcb;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RispostaDomandaUtilizzo {

        public boolean rispostaBudget;
        public BeanBudget budgetBean;

        private Stage stage;
        private Scene scene;
        private Parent root;

        public void switchToUtilizzo(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Utilizzo.fxml")));
            scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }
        public void switchToComponenti(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Componenti.fxml")));
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

        public void switchToEntry(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Entry.fxml")));
            scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }

        public void switchToBudget(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Budget.fxml")));
            scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        public void switchToConferma(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Conferma.fxml")));
            scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }





        public void selezionaRisposteUtilizzo(ActionEvent ae, DomandeUtente domandeUtente) throws IOException {
            String risposta = ((Button)ae.getSource()).getText();

            BeanUtilizzo u = new BeanUtilizzo(risposta);


           ConfermaRisposte confermaRisposte=new ConfermaRisposte();
           confermaRisposte.confermaRisposte(ae, domandeUtente);

            u.returnStr(domandeUtente);

            switchToConferma(ae);

        }




}
