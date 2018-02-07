package com.mercadolibre.dojos;

/**
 * Created by esomoza on 2/7/18.
 */
public class TwoWeeksBeforeAndOneWeekAfterEarningTripCostRule extends TripCostRule{

    @Override
    protected Boolean apply(int daysBetweenTodayAndTripDate) {
        return daysBetweenTodayAndTripDate <= 15 && daysBetweenTodayAndTripDate > 7;
    }

    @Override
    protected Price addPromotion(Price tripCost) {
        return tripCost.addPercentage(10);
    }
}
