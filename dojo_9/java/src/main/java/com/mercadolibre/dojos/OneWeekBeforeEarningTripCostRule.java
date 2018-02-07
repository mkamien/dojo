package com.mercadolibre.dojos;

/**
 * Created by esomoza on 2/7/18.
 */
public class OneWeekBeforeEarningTripCostRule extends TripCostRule{

    @Override
    protected Boolean apply(int daysBetweenTodayAndTripDate) {
        return daysBetweenTodayAndTripDate <= 7;
    }

    @Override
    protected Price addPromotion(Price tripCost) {
        return tripCost.addValue( new Price(100) );
    }
}
