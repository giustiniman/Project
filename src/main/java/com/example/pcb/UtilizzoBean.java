package com.example.pcb;

public class UtilizzoBean {

    String risposta_utilizzo;
    public UtilizzoBean(String risposta) {
        this.risposta_utilizzo = risposta;
    }

    public void returnStr(){
        System.out.println("bean utilizzo legge: "+ risposta_utilizzo);
    }
}
