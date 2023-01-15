package com.example.pcb;

public class BudgetBean {

    public int ricercaValore;

    public BudgetBean(String risposta){
        this.ricercaValore = risposta.length();

    }


    public void stampa(){
        System.out.println("classe bean ha letto risposta: "+ ricercaValore);
    }

    public void returnID(){
        System.out.println("Lunghezza stringa: " + ricercaValore);
        DomandeUtente.raccogliValoreB(ricercaValore);

    }

}

