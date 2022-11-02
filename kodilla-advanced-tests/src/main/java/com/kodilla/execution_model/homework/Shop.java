package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder (Order order) {
        this.orders.add(order);
    }

    public Set<Order> getOrdersFromSomeTime(){
        return this.orders.stream()
                .filter(order -> order.getDate().isAfter(LocalDate.now().minusYears(2)))
                .collect(Collectors.toSet());
    }
    public Set<Order> getOrdersWithValueFromTo(double valueMin, double valueMax){
        return this.orders.stream()
                .filter(order -> order.getValue() > valueMin && order.getValue()< valueMax)
                .collect(Collectors.toSet()); //toSet()
    }
    public long getNumberOfOrders(){
        long numberOfOrders = this.orders.stream()
                .count(); //orders.size
        return numberOfOrders;
    }
    public double getSumOfOrdersValue (){
        return this.orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }

}
