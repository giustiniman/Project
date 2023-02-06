package com.example.pcb;

public  class DomandeUtente {
    private static int budget;
    private String[] listaCaratteristicheUtilizzo= new String[9];
    private Boolean confermatoRisposte = true;

    public DomandeUtente(){

    }

    public BeanBudget raccogliValoreB(int b){
        int budgetPreso=b;
        ConfermaBean confermaBean=new ConfermaBean();
        /*
        System.out.println("Sto elaborando domanda "+ a +" BUDGET CA "+ budgetPreso);
        BudgetBean budgetBean= new BudgetBean();
        budgetBean.inviaU(utilizzoPreso);*/
        confermaBean.inviaB(budgetPreso);
        if(confermatoRisposte){
            //DomandeUtente.inserisciBudget(budgetPreso);
        }
        return null;
    }

    public BeanUtilizzo raccogliValoreU(String b){
        String utilizzoPreso=b;
        ConfermaBean confermaBean=new ConfermaBean();
        /*
        System.out.println("Sto elaborando domanda "+ a + " UTILIZZO CA "+utilizzoPreso);
        BudgetBean budgetBean= new BudgetBean();
        budgetBean.inviaU(utilizzoPreso);
        */
        confermaBean.inviaU(utilizzoPreso);
        //confermaBean.confermaValoreR(utilizzoPreso);
        if(confermatoRisposte){
            DomandeUtente.inserisciUtilizzo(utilizzoPreso);
        }
        return null;
    }
    public  ConfermaBean raccogliValoreR(Boolean b){
        Boolean confermaPresa=b;
        System.out.println("Sto elaborando domanda RISPOSTA CA "+ confermaPresa);
        if(confermaPresa==true){
            this.confermatoRisposte=true;
        }
        return null;
    }

    public static String inserisciUtilizzo(String utilizzoPreso) {
        //DaoUtilizzi daoUtilizzi= new DaoUtilizzi(utilizzoPreso);
        return null;
    }

    /*public static int inserisciBudget(int budgetPreso){
        DaoBudget daoBudget=new DaoBudget(budgetPreso);
        return budget;
    }*/



}
