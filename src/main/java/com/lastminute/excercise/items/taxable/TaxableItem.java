package com.lastminute.excercise.items.taxable;

import com.lastminute.excercise.items.BaseItem;

public abstract class TaxableItem extends BaseItem {

    public TaxableItem(int quantity, double price, boolean isImported) {
        super(quantity, price, 10.0, isImported);
    }
}