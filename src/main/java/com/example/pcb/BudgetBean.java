package com.example.pcb;

public class BudgetBean {

    String risposta_budget;

    public BudgetBean(String risposta){
        this.risposta_budget = risposta;

    }

    public void stampa(){
        System.out.println("classe bean ha letto risposta: "+ risposta_budget);
    }

    public void returnID(){

        int id = risposta_budget.length();
        System.out.println("Lunghezza stringa: " + id);

    }
}

