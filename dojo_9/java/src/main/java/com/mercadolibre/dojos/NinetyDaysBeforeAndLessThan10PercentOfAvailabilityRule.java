package com.mercadolibre.dojos;

/**
 * Created by mkamien on 2/14/18.
 */
public class NinetyDaysBeforeAndLessThan10PercentOfAvailabilityRule implements TripCostRule {

    AvailabilityService availabilityService;

    public NinetyDaysBeforeAndLessThan10PercentOfAvailabilityRule(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    public Boolean apply(Integer daysBetweenTodayAndTripDate) {
        return daysBetweenTodayAndTripDate <= 90 &&
                daysBetweenTodayAndTripDate > 15 && availabilityService.getAvailability() <= 10;
    }


    public Price earning(Price tripCost) {
        return tripCost.addPercentage(50);
    }

    public Price earning(Integer daysBetweenTodayAndTrip, Price tripCost) {
        return apply(daysBetweenTodayAndTrip) ? earning(tripCost) : tripCost;
    }
}
