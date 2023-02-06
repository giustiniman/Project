package com.example.pcb;

import com.example.pcb.BeanClass.BeanBudget;
import com.example.pcb.BeanClass.BeanUtilizzo;
import com.example.pcb.DomandeUtente;
import com.example.pcb.ConfermaRisposteGUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RispostaDomandaUtilizzoGUI {

        public boolean rispostaBudget;
        public BeanBudget budgetBean;
        public DomandeUtente istanzaCA ;
        public ConfermaRisposteGUI confermaRisposteGUI;

        private Stage stage;
        private Scene scene;
        private Parent root;


    public RispostaDomandaUtilizzoGUI(DomandeUtente riferimentoCapplicativo) {
        this.istanzaCA=riferimentoCapplicativo;
       // System.out.println("CG UTILIZZO Costruttore ");
    }

    /*
    public RispostaDomandaUtilizzo(DomandeUtente domandeUtente) {
        this.istanzaCA=domandeUtente;
    }
    */

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
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Conferma.fxml"));

            ConfermaRisposteGUI cRisposte=new ConfermaRisposteGUI(istanzaCA);

            loader.setControllerFactory(f -> cRisposte);

            scene = new Scene(loader.load());
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            cRisposte.crea();

        }



    public void vaiAConferma(ActionEvent ae) throws IOException {

        String risposta = ((Button)ae.getSource()).getText();
        System.out.println("CG UTILIZZO   "+ risposta);

        //u.returnStr();
        //this.istanzaCA.prendU(u);

        //istanzaCA= new DomandeUtente();
        //RispostaDomandaUtilizzo u = new RispostaDomandaUtilizzo(domandeUtente);

        //u.set(domandeUtente);

        //b.returnID();
        BeanUtilizzo u = new BeanUtilizzo(risposta);
        istanzaCA.prendU(u);
        
        

        switchToConferma(ae);
        //System.out.println("CG riferimento 1  "+ istanzaCA);
        //this.istanzaCA.prendU(u);
        //istanzaCA.prendU(u);
    }




}
