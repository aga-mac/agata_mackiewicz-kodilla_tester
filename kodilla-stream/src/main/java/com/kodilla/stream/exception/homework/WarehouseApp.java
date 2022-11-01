package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("234"));
        warehouse.addOrder(new Order("345"));
        warehouse.addOrder(new Order("456"));
        warehouse.addOrder(new Order("567"));

        try {
            String isOrderInUse = warehouse.isOrderInUse("678");
        } catch (OrderDoesntExistException e) {
            System.out.println("This order doesn't exist.");
        } finally {
            System.out.println("Thank you.");
        }
    }
}
