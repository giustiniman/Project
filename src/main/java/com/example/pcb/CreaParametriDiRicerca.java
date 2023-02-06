package com.example.pcb;

public class CreaParametriDiRicerca {
    private String[] listaComp=new String[9] ;



    public CreaParametriDiRicerca() {

    }

    public void produciParametri(int budget, String[] listaCaratteristicheUtilizzo) {
        int budgetDaDividere=budget;
        String[] listaCaratteristiche=listaCaratteristicheUtilizzo;
        int copertura=0;
        int percentualeTOT=0;
        for(int i=0;i<9;i++){
            int percentuale = (Integer.parseInt(listaCaratteristiche[i]));
            percentualeTOT=percentualeTOT+percentuale;
            //double  percentuale1= percentuale / 100 ;
            float  percentuale1= (float) (percentuale * 0.01);
            int risultato= (int) ((budgetDaDividere*percentuale1));
            System.out.println("risultato percentuale "+ percentuale1);


            System.out.println("risultato INTERO singolo "+ risultato);
            listaComp[i]=Integer. toString(risultato);
            copertura=copertura+ risultato;

            System.out.println("risultato STRINGA  "+ listaComp[i]);


        }
        System.out.println("risultato intero "+ copertura);
        System.out.println("risultato TOT PERCENT "+ percentualeTOT);
        generaRicercaComponenti(listaComp);
    }
    public void generaRicercaComponenti(String[] listaComp){
        RicercaComponentiComponent ricercaComponentiComponent=new RicercaComponentiComponent();
        ricercaComponentiComponent.richiediRicercaComponenti(listaComp);


    }

}
