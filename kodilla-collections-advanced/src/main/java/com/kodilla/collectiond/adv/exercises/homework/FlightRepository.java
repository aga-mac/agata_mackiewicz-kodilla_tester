package com.kodilla.collectiond.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Madryt"));
        flights.add(new Flight("Kraków", "Oslo"));
        flights.add(new Flight("Madryt", "Frankfurt"));
        flights.add(new Flight("Katowice", "Bolonia"));
        flights.add(new Flight("Oslo", "Katowice"));
        flights.add(new Flight("Kraków", "Praga"));
        flights.add(new Flight("Praga", "Katowice"));
    return flights;
    }
}
