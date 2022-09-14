package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLenght() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    @Test
    public void shouldGetNumberOfTransaction(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.operations(800);
        cashMachine.operations(-50);
        cashMachine.operations(700);
        cashMachine.operations(-1000);
        //then
        int[] transactions = cashMachine.getTransactions();
        assertEquals(4,transactions.length);
    }
    @Test
    public void shouldAddPayment(){

        CashMachine cashMachine = new CashMachine();
        cashMachine.operations(1300);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(1300,transactions[0]);
        assertEquals(1,transactions.length);
    }
    @Test
    public void shouldGetBalance() {

        CashMachine cashMachine = new CashMachine();
        cashMachine.operations( 6700);
        cashMachine.operations(2300);
        cashMachine.operations(-800);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(8200, cashMachine.getBalance());
        assertEquals(3, transactions.length);
    }

}
