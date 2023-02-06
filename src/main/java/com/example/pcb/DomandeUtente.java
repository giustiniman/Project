package com.example.pcb;

import com.example.pcb.BeanClass.BeanBudget;
import com.example.pcb.BeanClass.BeanConferma;
import com.example.pcb.BeanClass.BeanMostraResoconto;
import com.example.pcb.BeanClass.BeanUtilizzo;
import com.example.pcb.DaoClass.DaoBudget;
import com.example.pcb.DaoClass.DaoUtilizzi;

import java.sql.SQLException;

public  class DomandeUtente {
    private int budget;
    private String[] listaCaratteristicheUtilizzo= new String[9];
    public BeanMostraResoconto mostraResoconto;
    private Boolean confermatoRisposte;
    public int budgetProvissorio;
    public String utilizzoProvissorio;
   // public ConfermaRisposteGUI confermaRisposteGUI;


    public DomandeUtente(){

    }
/*
    public BeanBudget raccogliValoreB(int b){
        int budgetPreso=b;
        ConfermaBean confermaBean=new ConfermaBean();
        /*
        System.out.println("Sto elaborando domanda "+ a +" BUDGET CA "+ budgetPreso);
        BudgetBean budgetBean= new BudgetBean();
        budgetBean.inviaU(utilizzoPreso);
        confermaBean.inviaB(budgetPreso);
        if(confermatoRisposte){
            DomandeUtente.inserisciBudget(budgetPreso);
        }
        return null;
    }

    public BeanUtilizzo raccogliValoreU(String b){
        String utilizzoPreso=b;
        ConfermaBean confermaBean=new ConfermaBean();
        /*
        System.out.println("Sto elaborando domanda "+ a + " UTILIZZO CA "+utilizzoPreso);
        BudgetBean budgetBean= new BudgetBean();
        budgetBean.inviaU(utilizzoPreso);

        confermaBean.inviaU(utilizzoPreso);
        //confermaBean.confermaValoreR(utilizzoPreso);
        if(confermatoRisposte){
            DomandeUtente.inserisciUtilizzo(utilizzoPreso);
        }
        return null;
    }
    public  ConfermaBean raccogliValoreR(Boolean b){
        Boolean confermaPresa=b;
        System.out.println("Sto elaborando domanda RISPOSTA CA "+ confermaPresa);
        if(confermaPresa==true){
            this.confermatoRisposte=true;
        }
        return null;
    }

    public static String inserisciUtilizzo(String utilizzoPreso) {
        DaoUtilizzi daoUtilizzi= new DaoUtilizzi(utilizzoPreso);
        return null;
    }

    public static int inserisciBudget(int budgetPreso){
        DaoBudget daoBudget=new DaoBudget(budgetPreso);
        return budget;
    }

*/
    public void prendB(BeanBudget b){

        //int budget1= b.returnID();
        this.budgetProvissorio =b.returnID();
        //System.out.println("ricevo budget da CA  "+ budget1);
    }
    public void prendU(BeanUtilizzo u){

        //String risposta= u.returnStr();
        this.utilizzoProvissorio =u.returnStr();
        //System.out.println("ricevo Utilizzo da CA  "+ risposta);

    }

    public void getMostraResoconto(BeanMostraResoconto mR) {
        this.mostraResoconto=mR;
        System.out.println("indirizzo mostraResoconto Bean  "+ mostraResoconto);
        invioResoconto();
    }

    public void prendC(BeanConferma c) {
        this.confermatoRisposte= c.returnBool();
        //System.out.println("ricevo Conferma da CA  "+ confermatoRisposte);
        if(confermatoRisposte){
            //crea classe dao

            DaoBudget daoBudget=new DaoBudget(budgetProvissorio);

            try {
                DaoBudget.getDaoBudgetConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                daoBudget.cercaValore();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


            DaoUtilizzi daoUtilizzi=new DaoUtilizzi(utilizzoProvissorio);
            try {
                DaoUtilizzi.getDaoUtilizziConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                daoUtilizzi.cercaCaratteristiche();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


            //chiedi il return dei valori trovati e this. attributo
            this.budget=daoBudget.returnValoreBudget();
            this.listaCaratteristicheUtilizzo=daoUtilizzi.returnListaUtilizzo();
        }
        //inviaRisposteUtente(budget,listaCaratteristicheUtilizzo);
        CreaParametriDiRicerca creaParametriDiRicerca=new CreaParametriDiRicerca();
        creaParametriDiRicerca.produciParametri( budget,listaCaratteristicheUtilizzo);

    }


    public void inviaRisposteUtente(int budget, String[] listaCaratteristicheUtilizzo){
        CreaParametriDiRicerca creaParametriDiRicerca=new CreaParametriDiRicerca();
    }
    public void invioResoconto(){

        mostraResoconto.getmostraB(budgetProvissorio);
        mostraResoconto.getmostraU(utilizzoProvissorio);

    }


}
