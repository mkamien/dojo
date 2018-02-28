package com.mercadolibre.dojos;

import java.util.ArrayList;

/**
 * Created by mkamien on 1/24/18.
 */
public class TripCalculator {

    ArrayList<TripCostRule> tripCostRuleList;
    ApiAvailabilityService apiAvailabilityService;

    public TripCalculator() {
        this.apiAvailabilityService = new RealApiAvailabilityService();
        init();
    }

    public TripCalculator(ApiAvailabilityService apiAvailabilityService) {
        this.apiAvailabilityService = apiAvailabilityService;
        init();
    }

    private void init() {
        tripCostRuleList = new ArrayList<TripCostRule>();
        tripCostRuleList.add(new OneWeekBeforeEarningTripCostRule());
        tripCostRuleList.add(new TwoWeeksBeforeAndOneWeekAfterEarningTripCostRule());
        tripCostRuleList.add(new ThreeMonthsBeforeAndTwoWeeksAfterAndLessThanTenPercentAvailabilityTripCostRule(this.apiAvailabilityService));
        tripCostRuleList.add(new ThreeMonthsBeforeAndTwoWeeksAfterAndMoreThanTenPercentAvailabilityTripCostRule(this.apiAvailabilityService));
        tripCostRuleList.add(new SixMonthsBeforeAndThreeMonthsAfterAndMoreThanEightyPercentAvailabilityTripCostRule(this.apiAvailabilityService));
        tripCostRuleList.add(new SixMonthsBeforeAndThreeMonthsAfterAndLessThanEightyPercentAvailabilityTripCostRule(this.apiAvailabilityService));
    }

    public Price calculate(Trip trip, TripDate inquiryDate) {
        Integer daysBetweenTodayAndTripDate = trip.daysToDeparture(inquiryDate);

        Price finalCost = this.calculateEarning(trip.getTotalCost(), daysBetweenTodayAndTripDate);

        return finalCost;
    }

    private Price calculateEarning(Price tripCost, Integer daysBetweenTodayAndTripDate) {

        for( TripCostRule tripCostRule : tripCostRuleList ) {
            tripCost = tripCostRule.addPromotionIfApply(daysBetweenTodayAndTripDate, tripCost);
        }

        return tripCost;
    }
}
