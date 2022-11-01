package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldHaveFourLength() {
        CashMachine ATM = new CashMachine();
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        Bank bankING = new Bank(new CashMachine[]{ATM, ATM1, ATM2, ATM3});
        CashMachine[] cashMachines = bankING.getCashMachines();
        assertEquals(4, cashMachines.length);
    }

    @Test
    public void shouldReturnTotalBalance() {
        CashMachine ATM = new CashMachine();
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();

        Bank bankING = new Bank (new CashMachine[]{ATM, ATM1, ATM2, ATM3});

        ATM.operations(7000);
        ATM1.operations(-300);
        ATM2.operations(100);
        ATM3.operations(-800);

        bankING.getTotalBalance();
        assertEquals(6000, bankING.getTotalBalance());
    }

    @Test
    public void shouldReturnTotalNumberOfDeposits() {

        CashMachine ATM = new CashMachine();
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();

        Bank bankING = new Bank(new CashMachine[]{ATM, ATM1, ATM2, ATM3});

        ATM.operations(400);
        ATM1.operations(-200);
        ATM2.operations(100);
        ATM3.operations(800);

        bankING.getTotalNumberOfDeposits();
        assertEquals(3, bankING.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldReturnTotalNumberOfWithdrawals() {

        CashMachine ATM = new CashMachine();
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();

        Bank bankING = new Bank(new CashMachine[]{ATM, ATM1, ATM2, ATM3});

        ATM1.operations(600);
        ATM.operations(900);
        ATM3.operations(100);
        ATM2.operations(-800);

        bankING.getTotalNumberOfWithdrawals();
        assertEquals(1, bankING.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnTotalAverageOfDeposits() {
        CashMachine ATM = new CashMachine();
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();

        Bank bankING = new Bank(new CashMachine[]{ATM, ATM1, ATM2, ATM3});

        ATM1.operations(500);
        ATM.operations(-350);
        ATM3.operations(850);
        ATM2.operations(750);


        bankING.getTotalNumberOfDeposits();
        assertEquals(700, bankING.getTotalAverageOfDeposits());
    }
    @Test
    public void shouldReturnTotalAverageOfWithdrawals() {

        CashMachine ATM = new CashMachine();
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();

        Bank bank = new Bank(new CashMachine[]{ATM, ATM1, ATM2, ATM3});

        ATM.operations(-8000);
        ATM2.operations(100);
        ATM3.operations(800);
        ATM1.operations(-1500);

        bank.getTotalAverageOfWithdrawals();
        assertEquals(-4750, bank.getTotalAverageOfWithdrawals());
    }
}
