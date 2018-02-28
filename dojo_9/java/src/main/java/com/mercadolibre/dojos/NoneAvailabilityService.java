package com.mercadolibre.dojos;

/**
 * Created by mkamien on 2/14/18.
 */
public class NoneAvailabilityService implements AvailabilityService {

    public Integer getAvailability() {
        return 0;
    }
}
