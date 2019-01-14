package com.lastminute.excercise.items.taxable;

import com.lastminute.excercise.items.Item;

public class CD extends TaxableItem implements Item {

    String title;

    public CD(String title, int quantity, double cost, boolean isImported) {
        super(quantity, cost, isImported);
        this.title = title;
    }

    @Override
    public String name() {
        return "music CD";
    }
}