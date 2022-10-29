package com.kodilla.collectiond.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void findFlightsFrom_addToList_addedCorrectlyToTable() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsFrom("Kraków");
        //then
        assertEquals(2, result.size());
    }

    @Test
    public void findFlightsFrom_searchDepartures_addToDepartureTable() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsFrom("Kraków");
        //then
        List<Flight> expectedTable = new ArrayList<>();
        expectedTable.add(new Flight("Kraków", "Oslo"));
        expectedTable.add(new Flight("Kraków", "Praga"));
        assertEquals(expectedTable, result);
    }

    @Test
    public void findFlightsFrom_searchNonExistingDeparture_emptyDeparture() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsFrom("Wrocław");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void findFlightsTo_addToList_addedCorrectlyToTable() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsTo ("Katowice");
        //then
        assertEquals(2, result.size());
    }

    @Test
    public void findFlightsTo_searchArrivals_addToArrivalTable() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsTo("Katowice");
        //then
        List<Flight> expectedTable = new ArrayList<>();
        expectedTable.add(new Flight("Oslo", "Katowice"));
        expectedTable.add(new Flight("Praga", "Katowice"));
        assertEquals(expectedTable, result);
    }

    @Test
    public void findFlightsTo_searchNonExistingArrival_emptyDeparture() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsTo("Kopenhaga");
        //then
        assertEquals(0, result.size());
    }
}