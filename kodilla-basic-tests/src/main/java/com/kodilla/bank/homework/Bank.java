package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    private int size;

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int getSize() {
        return size;
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalNumberOfDeposits() {
        int totalNumberOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfDeposits += cashMachines[i].getNumberOfDeposits();
        }
        return totalNumberOfDeposits;
    }

    public int getTotalNumberOfWithdrawals() {
        int totalNumberOfWithdrawals = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfWithdrawals += cashMachines[i].getNumberOfWithdrawals();
        }
        return totalNumberOfWithdrawals;
    }

    public int getTotalAverageOfDeposits() {
        int totalSumOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumOfDeposits += cashMachines[i].getSumOfDeposits();
        }
        return totalSumOfDeposits / getTotalNumberOfDeposits();
    }

    public int getTotalAverageOfWithdrawals() {
        int totalSumInMinus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumInMinus += cashMachines[i].getSumOfWithdrawals();
        }
        return totalSumInMinus / getTotalNumberOfWithdrawals();
    }
}
