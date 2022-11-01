package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("O123"));
        warehouse.addOrder(new Order("O234"));
        warehouse.addOrder(new Order("O345"));
        warehouse.addOrder(new Order("O456"));
        warehouse.addOrder(new Order("O567"));

        try {
            String isOrderInUse = warehouse.isOrderInUse("O678");
        } catch (OrderDoesntExistException e) {
            System.out.println("This order doesn't exist.");
        } finally {
            System.out.println("Thank you.");
        }
    }
}
