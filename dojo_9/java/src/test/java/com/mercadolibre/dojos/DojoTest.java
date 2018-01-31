package com.mercadolibre.dojos;


import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {


    @Test
    public void buyingTicketOneWeekBeforeDepatureCostsOneHundredMoreThanBeforeFromBuenosAiresToMarDelPlataByBus(){

        TripDate tripDate = new TripDate(02,02,2018);
        Price initialPrice = new Price(50);


        Place initialPlace = new Place("Buenos Aires");
        Place finalPlace = new Place("Mar del Plata");
        Bus bus = new Bus( initialPlace, finalPlace , initialPrice);

        Trip trip = new Trip(tripDate, bus);

        TripCalculator calculator = new TripCalculator();

        Price finalPrice = new Price(150);
        TripDate todayDate = new TripDate(01,02,2018);
        Assert.assertTrue( calculator.calculate(trip, todayDate).equals(finalPrice) );
    }

    @Test
    public void buyingTicketOneWeekBeforeDepatureCostsOneHundredMoreThanBeforeFromBuenosAiresToBahiaBlancaByBus(){

        TripDate tripDate = new TripDate(02,02,2018);
        Price initialPrice = new Price(100);


        Place initialPlace = new Place("Buenos Aires");
        Place finalPlace = new Place("Bahia Blanca");
        Bus bus = new Bus( initialPlace, finalPlace , initialPrice);

        Trip trip = new Trip(tripDate, bus);

        TripCalculator calculator = new TripCalculator();

        Price finalPrice = new Price(200);
        TripDate todayDate = new TripDate(01,02,2018);
        Assert.assertTrue( calculator.calculate(trip, todayDate).equals(finalPrice) );
    }

    @Test
    public void buyingTicketTwoWeeksBeforeDepartureCostsTenPercentMoreThanBeforeFromBuenosAiresToMarDelPlataByBus(){
        Place initialPlace = new Place("Buenos Aires");
        Place finalPlace = new Place("Bahia Blanca");
        Price initialPrice = new Price(100);
        Bus bus = new Bus( initialPlace, finalPlace , initialPrice);

        TripDate tripDate = new TripDate(15,02,2018);
        Trip trip = new Trip(tripDate, bus);

        TripCalculator calculator = new TripCalculator();
        TripDate todayDate = new TripDate(01,02,2018);
        Price finalPrice = new Price(110);
        Assert.assertTrue( calculator.calculate(trip, todayDate).equals(finalPrice) );

    }
}
