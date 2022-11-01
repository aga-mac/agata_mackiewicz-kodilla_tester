package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public Order addOrder(Order order){
        orders.add(order);
        System.out.println(order.getNumber() + " added.");
        return order;
    }
    public Order getOrder(String number) throws OrderDoesntExistException{
        Order order = getOrders()
                .stream()
                .filter(g->g.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
        return order;
    }
    public String isOrderInUse (String number) throws OrderDoesntExistException {
        Order order = getOrder(number);
        String orderNumber = order.getNumber();
        if (orderNumber.equals(number)){
            return orderNumber;
        }
        throw new OrderDoesntExistException();
    }
    public Set<Order> getOrders(){
        return orders;
    }

}
