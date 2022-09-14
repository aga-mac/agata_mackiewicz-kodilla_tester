package com.kodilla.bank.homework;

public class BankApplication {
    public static void main(String[] args) {
        CashMachine ATM = new CashMachine();
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();

        Bank bankING = new Bank (new CashMachine[] {ATM, ATM1, ATM2, ATM3});

        ATM.operations(700);
        ATM1.operations(-300);
        ATM2.operations(-100);
        ATM3.operations(1300);
        ATM.operations(300);

        System.out.println("Bank ING has " + bankING.getTotalAverageOfDeposits() + " average deposits.");
        System.out.println(bankING.getTotalBalance());
    }
}
