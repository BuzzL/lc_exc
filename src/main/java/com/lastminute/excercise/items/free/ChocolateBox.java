package com.lastminute.excercise.items.free;

import com.lastminute.excercise.items.Item;

public class ChocolateBox extends FreeItem implements Item {

    public ChocolateBox(int quantity, double cost, boolean isImported) {
        super(quantity, cost, isImported);

    }

    @Override
    public String name() {
        return "box of chocolates";
    }
}