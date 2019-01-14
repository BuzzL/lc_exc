package com.lastminute.excercise.items.free;

import com.lastminute.excercise.items.BaseItem;

public abstract class FreeItem extends BaseItem {

    public FreeItem(int quantity, double price, boolean isImported) {
        super(quantity, price, 0.0, isImported);
    }
}