package com.mercadolibre.dojos;

/**
 * Created by mkamien on 1/24/18.
 */
public class Trip {

    private Bus segment;
    private TripDate date;

    public Trip(TripDate tripDate, Bus segment) {
        this.date = tripDate;
        this.segment = segment;
    }

    public Price getTotalCost() {
        return segment.getPrice();
    }

    public Integer daysToDeparture(TripDate inquiryDate) {
        return this.date.calculateDaysDistance(inquiryDate);
    }
}
