package com.mercadolibre.dojos;

/**
 * Created by mkamien on 2/7/18.
 */
public class TwoWeekBeforeRule implements TripCostRule {

    public Boolean apply(Integer daysBetweenTodayAndTripDate) {
        return daysBetweenTodayAndTripDate <= 15 && daysBetweenTodayAndTripDate > 7;
    }

    private Price earning(Price tripCost){
        return tripCost.addPercentage(10);
    }

    public Price earning(Integer daysBetweenTodayAndTrip, Price tripCost) {
        return apply(daysBetweenTodayAndTrip) ? earning(tripCost) : tripCost;
    }
}
