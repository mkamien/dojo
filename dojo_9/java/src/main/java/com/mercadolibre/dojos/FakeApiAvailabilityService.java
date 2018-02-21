package com.mercadolibre.dojos;

/**
 * Created by esomoza on 2/21/18.
 */
public class FakeApiAvailabilityService implements ApiAvailabilityService {
    private Integer apiAvailabilityPercentaje;

    public FakeApiAvailabilityService(Integer apiAvailabilityPercentaje){
        this.apiAvailabilityPercentaje = apiAvailabilityPercentaje;
    }

    public Integer getAvailability() {
        return this.apiAvailabilityPercentaje;
    }
}
