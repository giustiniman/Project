package com.example.pcb;

public class ConfermaBean {

    Boolean conferma;

    public ConfermaBean(String answer){
        if(answer.equals("Conferma")){
            conferma = true;
        }
        else{
            conferma = false;
        }
    }
}
