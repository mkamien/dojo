package com.mercadolibre.dojos;

/**
 * Created by mkamien on 2/7/18.
 */
public class OneWeekBeforeRule implements TripCostRule {
    public Boolean apply(Integer daysBetweenTodayAndTripDate) {
        return daysBetweenTodayAndTripDate <= 7;
    }

    private Price earning(Price tripCost){
        return tripCost.addValue( new Price(100) );
    }

    public Price earning(Integer daysBetweenTodayAndTrip, Price tripCost) {
        return apply(daysBetweenTodayAndTrip) ? earning(tripCost) : tripCost;
    }
}
