package com.lastminute.excercise.items.free;

import com.lastminute.excercise.items.Item;

public class ChocolateBar extends FreeItem implements Item {

    public ChocolateBar(int quantity, double cost, boolean isImported) {
        super(quantity, cost, isImported);
    }

    @Override
    public String name() {
        return "chocolate bar";
    }
}