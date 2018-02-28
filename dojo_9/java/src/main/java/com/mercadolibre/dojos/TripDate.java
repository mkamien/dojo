package com.mercadolibre.dojos;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by mkamien on 1/24/18.
 */
public class TripDate {

    private Date date;

    public TripDate(int day, int month, int year) {
        this.date = new Date(year, month, day);
    }

    public Integer calculateDaysDistance(TripDate date) {
        long startTime = this.date.getTime();
        long endTime = date.date.getTime();
        long diffTime = endTime - startTime;
        return Math.abs((int) TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS));
    }

    public TripDate addDays(Integer numberOfDays) {
        return new TripDate(10,12,2016);
    }
}
