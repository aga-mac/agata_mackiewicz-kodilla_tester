package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void operations(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getNumberOfOperations() {
        System.out.println("ATM number of operations: " + transactions.length);
        return transactions.length;
    }

    public int getNumberOfDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                numberOfDeposits++;
            }
            return numberOfDeposits;
        }

    public int getNumberOfWithdrawals() {
        int numbersOfWithdrawals = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                numbersOfWithdrawals++;
        }
        return numbersOfWithdrawals++;
    }
    public int getSumOfDeposits() {
        int sumOfDeposits = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                sumOfDeposits += transactions[i];
        }
        return sumOfDeposits;
    }
    public int getSumOfWithdrawals() {
        int sumOfWithdrawals = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                sumOfWithdrawals += transactions[i];
        }
        return sumOfWithdrawals;
    }
}

