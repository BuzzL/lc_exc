package com.lastminute.excercise.items;

public abstract class BaseItem implements Item {

    private static final double IMPORT_TAX_RATE = 5.0;

    private int quantity;
    private double cost;
    private boolean isImported;
    private double taxRate;

    public BaseItem(int quantity, double cost, double salesTaxRate, boolean isImported) {
        this.quantity = quantity;
        this.cost = cost;
        this.isImported = isImported;
        this.taxRate = salesTaxRate + (isImported ? IMPORT_TAX_RATE : 0.0);
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public double price() {
        return cost + taxes();
    }

    @Override
    public double taxes() {
       return Math.round((cost*taxRate)/5.0)/20.0;
    }

    @Override
    public boolean isImported() {
        return isImported;
    }
}