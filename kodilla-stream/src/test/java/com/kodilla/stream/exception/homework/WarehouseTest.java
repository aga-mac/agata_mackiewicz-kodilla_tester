package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        warehouse.addOrder(new Order("Order4"));
        //when
        String isOrderInUse = warehouse.isOrderInUse("Order3");
        //then
        assertEquals(isOrderInUse, "Order3");
    }

    @Test
    public void testIsOrderInUse_withException(){
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        warehouse.addOrder(new Order("Order4"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, ()->warehouse.isOrderInUse("Order5"));
    }

}