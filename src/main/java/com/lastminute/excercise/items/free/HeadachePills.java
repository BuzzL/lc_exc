package com.lastminute.excercise.items.free;

import com.lastminute.excercise.items.Item;

public class HeadachePills extends FreeItem implements Item {

    String name;

    public HeadachePills(String name, int quantity, double price, boolean isImported) {
        super(quantity, price, isImported);
        this.name = name;

    }

    @Override
    public String name() {
        return "packet of headache pills";
    }
}