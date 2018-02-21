package com.mercadolibre.dojos;

/**
 * Created by esomoza on 2/7/18.
 */
public class ThreeMonthsBeforeAndTwoWeeksAfterAndMoreThanTenPercentAvailabilityTripCostRule extends TripCostRule{

    private ApiAvailabilityService apiAvailabilityService;

    ThreeMonthsBeforeAndTwoWeeksAfterAndMoreThanTenPercentAvailabilityTripCostRule(ApiAvailabilityService apiAvailabilityService){
        this.apiAvailabilityService = apiAvailabilityService;
    }

    @Override
    protected Boolean apply(Integer daysBetweenTodayAndTripDate) {
        Integer availability = apiAvailabilityService.getAvailability();
        return daysBetweenTodayAndTripDate <= 90 && daysBetweenTodayAndTripDate > 15 && availability > 10;
    }

    @Override
    protected Price addPromotion(Price tripCost) {
        return tripCost.addPercentage(-20);
    }
}
