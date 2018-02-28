package com.mercadolibre.dojos;

/**
 * Created by mkamien on 2/14/18.
 */
public class FakeAvailabilityService implements AvailabilityService {

    private Integer availability;

    public FakeAvailabilityService(Integer availability) {
        this.availability = availability;
    }

    public Integer getAvailability() {
        return this.availability;
    }
}
