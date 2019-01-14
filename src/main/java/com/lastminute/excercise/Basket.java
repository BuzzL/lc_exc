package com.lastminute.excercise;

import com.lastminute.excercise.items.Item;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    static final DecimalFormat FORMATTER = new DecimalFormat("#0.00");
    List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();

    }
    public void addItem(Item item) {
        items.add(item);
    }

    public String printReceipt() {
        StringBuilder sb = new StringBuilder();
        double total = 0.0, salesTaxes = 0.0;

        for (Item item : items) {
            int quantity = item.quantity();
            double price = quantity * item.price();
            sb.append(quantity).append(' ');
            if (item.isImported())
                sb.append("imported ");
            sb.append(item.name());
            if (quantity>1)
                sb.append('s');
            sb.append(": ").append(FORMATTER.format(price)).append('\n');
            total += price;
            salesTaxes += item.taxes();
        }

        sb.append("Sales Taxes: ").append(FORMATTER.format(salesTaxes)).append('\n');
        sb.append("Total: ").append(FORMATTER.format(total)).append('\n');

        return sb.toString();
    }
}