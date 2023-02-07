package com.example.pcb;

public class BeanUtilizzo {

    String ricercaTipoUtilizzo;
    public BeanUtilizzo(String risposta) {
        this.ricercaTipoUtilizzo = risposta;
    }

    public void returnStr(DomandeUtente domandeUtente){
        System.out.println("bean utilizzo legge: "+ ricercaTipoUtilizzo);
       // DomandeUtente.raccogliValoreU(ricercaTipoUtilizzo);
        domandeUtente.raccogliValoreU(ricercaTipoUtilizzo);
    }
}
