package com.mercadolibre.dojos;

/**
 * Created by mkamien on 1/24/18.
 */
public class TripCalculator {

    public Price calculate(Trip trip, TripDate inquiryDate) {
        Integer daysBetweenTodayAndTripDate = trip.daysToDeparture(inquiryDate);

        Price finalCost = this.calculateEarning(trip.getTotalCost(), daysBetweenTodayAndTripDate);

        return finalCost;
    }

    private Price calculateEarning(Price tripCost, Integer daysBetweenTodayAndTripDate) {
        if(daysBetweenTodayAndTripDate <= 7){
            Price oneWeekBeforeEarning = new Price(100);
            return tripCost.addValue( oneWeekBeforeEarning );
        } else if(daysBetweenTodayAndTripDate <= 15){
            return tripCost.addPercentage(10);
        }
        return new Price(0);
    }
}
