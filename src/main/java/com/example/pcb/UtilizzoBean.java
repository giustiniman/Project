package com.example.pcb;

public class UtilizzoBean {

    String ricercaTipoUtilizzo;
    public UtilizzoBean(String risposta) {
        this.ricercaTipoUtilizzo = risposta;
    }

    public void returnStr(){
        System.out.println("bean utilizzo legge: "+ ricercaTipoUtilizzo);
       // DomandeUtente.raccogliValoreU(ricercaTipoUtilizzo);
        DomandeUtente.raccogliValoreU(ricercaTipoUtilizzo);
    }
}
