package com.kodilla.collectiond.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    List<Flight> flightTable = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom (String departure) {
        List<Flight> departureTable = new ArrayList<>();
        for (Flight flight : flightTable) {
            if (flight.getDeparture().equals(departure)) {
                departureTable.add(flight);
            }
        }
        return departureTable;
    }

    public List <Flight> findFlightsTo (String arrival) {
        List<Flight> arrivalTable = new ArrayList<>();
        for (Flight flight : flightTable) {
            if (flight.getArrival().equals(arrival)) {
                arrivalTable.add(flight);
            }
        }
        return arrivalTable;
    }
}
