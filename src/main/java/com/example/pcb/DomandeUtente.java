package com.example.pcb;

public class DomandeUtente {
    private int budget;
    private static int a;
    String[] listaCaratteristicheUtilizzo= new String[9];

    public DomandeUtente(){

    }
    public void attivo(){
        System.out.println(" ATTIVO CA");
    }
    /*
    public void lavoraDomanda(BudgetBean b){
        System.out.println("Sto elaborando domanda CA");
        b.stampa();

    }
    public void lavoraDomanda(UtilizzoBean b){
        System.out.println("Sto elaborando domanda CA");
        b.stampa();
    }
    public void lavoraDomanda(ConfermaBean b){
        System.out.println("Sto elaborando domanda CA");
        b.stampa();
    }*/
    public static BudgetBean raccogliValoreB(int b){
        int budgetPreso=b;
        a=0;
        System.out.println("Sto elaborando domanda "+ a +" BUDGET CA "+ budgetPreso);
        //b.stampa();

        return null;
    }
   /* public static int add(){
        a=a+1;
        return a;
    }
*/

    public static UtilizzoBean raccogliValoreU(String b){
        String utilizzoPreso=b;
        System.out.println("Sto elaborando domanda "+ a + " UTILIZZO CA "+utilizzoPreso);
        //b.stampa();
        return null;
    }
    public static ConfermaBean raccogliValoreR(Boolean b){
        Boolean confermaPresa=b;
        System.out.println("Sto elaborando domanda RISPOSTA CA "+ confermaPresa);
        return null;
    }


}
