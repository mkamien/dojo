package com.mercadolibre.dojos;

/**
 * Created by mkamien on 1/24/18.
 */
public class Bus {

    private Place initialPlace;
    private Place finalPlace;
    private Price cost;

    public Bus(Place initialPlace, Place finalPlace, Price initialPrice) {
        this.initialPlace = initialPlace;
        this.finalPlace = finalPlace;
        this.cost = initialPrice;
    }

    public Price getPrice() {
        return this.cost;
    }
}
