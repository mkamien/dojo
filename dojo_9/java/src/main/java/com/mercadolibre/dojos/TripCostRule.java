package com.mercadolibre.dojos;

/**
 * Created by mkamien on 2/7/18.
 */
public interface TripCostRule {

    Price earning(Integer daysBetweenTodayAndTrip, Price tripCost);
}
