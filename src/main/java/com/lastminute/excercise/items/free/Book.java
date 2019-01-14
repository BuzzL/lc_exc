package com.lastminute.excercise.items.free;

public class Book extends FreeItem {

    private String title;

    public Book(String title, int quantity, double cost, boolean isImported) {
        super(quantity, cost, isImported);
        this.title = title;
    }

    @Override
    public String name() {
        return "book";
    }
}