package com.example.pcb;

public interface BudgetSubject {

    void addObserver(BudgetObserver observer);
    void removeObserver(BudgetObserver observer);
    void notifyObservers(int budget);

}
