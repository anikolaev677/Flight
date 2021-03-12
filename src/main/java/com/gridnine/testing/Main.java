package com.gridnine.testing;

import com.gridnine.testing.flights.Flight;
import com.gridnine.testing.flights.FlightBuilder;
import service.FilterChain;
import service.FlightClient;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        final List<Flight> flights = FlightBuilder.createFlights();
        FilterChain filterChain = new FilterChain(flights);
        FlightClient flightClient = new FlightClient(filterChain);
        flightClient.showFlightList();
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("linkedList sort took: %d ms", millis));
    }
}
