package com.example.pcb;

import com.example.pcb.BeanClass.BeanBudget;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class RispostaDomandaBudgetGUI {



    public BeanBudget budgetBean;

    public static DomandeUtente domandeUtente;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToUtilizzo(ActionEvent event) throws IOException {
        //root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Utilizzo.fxml")));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Utilizzo.fxml"));
        loader.setControllerFactory(f -> new RispostaDomandaUtilizzoGUI(domandeUtente));
        scene = new Scene(loader.load());
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


    public void selezionaRisposteBudget(ActionEvent ae) throws IOException {
        String risposta = ((Button)ae.getSource()).getText();

        System.out.println("CG  Budget selezionato: " + risposta);

        BeanBudget b = new BeanBudget(risposta);
        domandeUtente= new DomandeUtente();
        //RispostaDomandaUtilizzo u = new RispostaDomandaUtilizzo(domandeUtente);

        //u.set(domandeUtente);

        //b.returnID();
        domandeUtente.prendB(b);
        switchToUtilizzo(ae);
    }



}
