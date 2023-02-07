package com.example.pcb;

public class BeanBudget {

    public int ricercaValore;

    public BeanBudget() {

    }
    public BeanBudget(String risposta){
        this.ricercaValore = risposta.length();

    }




    public void stampa(){
        System.out.println("classe bean ha letto risposta: "+ ricercaValore);
    }

    public void returnID(DomandeUtente domanda){
        System.out.println("Lunghezza stringa: " + ricercaValore);
        domanda.raccogliValoreB(ricercaValore);
        //RispostaDomandaBudget.domandeUtente.raccogliValoreB(ricercaValore);

    }

}

