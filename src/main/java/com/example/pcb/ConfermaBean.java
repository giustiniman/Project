package com.example.pcb;

public class ConfermaBean {

    Boolean conferma;

    public ConfermaBean(String answer){
        if(answer.equals("Conferma")){
            this.conferma = true;
        }
        else{
            this.conferma = false;
        }
        DomandeUtente.raccogliValoreR(conferma);
    }
}
