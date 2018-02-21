package com.mercadolibre.dojos;

/**
 * Created by esomoza on 2/7/18.
 */
public abstract class TripCostRule {
    protected abstract Boolean apply(Integer daysBetweenTodayAndTripDate);
    protected abstract Price addPromotion(Price tripCost);

    public Price addPromotionIfApply(Integer daysBetweenTodayAndTripDate, Price tripCost) {
        return apply(daysBetweenTodayAndTripDate) ? addPromotion(tripCost) : tripCost;
    }
}
