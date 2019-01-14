package com.lastminute.excercise.items.taxable;

import com.lastminute.excercise.items.Item;

public class Perfume extends TaxableItem implements Item {

    String brand;

    public Perfume(String brand, int quantity, double cost, boolean isImported) {
        super(quantity, cost, isImported);
        this.brand = brand;
    }

    @Override
    public String name() {
        return "bottle of perfume";
    }
}