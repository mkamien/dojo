package com.mercadolibre.dojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkamien on 1/24/18.
 */
public class TripCalculator {

    List<TripCostRule> earningRules;
    AvailabilityService availabilityService;

    public TripCalculator() {
        this.availabilityService = new NoneAvailabilityService();
        this.init(this.availabilityService);
    }

    public TripCalculator(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
        this.init(this.availabilityService);
    }

    private void init(AvailabilityService availabilityService){
        this.earningRules = new ArrayList<TripCostRule>();
        this.earningRules.add( new OneWeekBeforeRule() );
        this.earningRules.add( new TwoWeekBeforeRule() );
        this.earningRules.add( new NinetyDaysBeforeAndLessThan10PercentOfAvailabilityRule(availabilityService) );
        this.earningRules.add( new NinetyDaysBeforeAndMoreThan10PercentOfAvailabilityRule(availabilityService) );
    }

    public Price calculate(Trip trip, TripDate inquiryDate) {
        Integer daysBetweenTodayAndTripDate = trip.daysToDeparture(inquiryDate);

        Price finalCost = this.calculateEarning(trip.getTotalCost(), daysBetweenTodayAndTripDate);

        return finalCost;
    }

    private Price calculateEarning(Price tripCost, Integer daysBetweenTodayAndTripDate) {
        Price earningPrice = tripCost;

        for (TripCostRule tripCostRule: this.earningRules) {
            earningPrice = tripCostRule.earning(daysBetweenTodayAndTripDate, earningPrice);
        }

        return earningPrice;
    }
}
