package com.lastminute.excercise.items;

public interface Item {

    String name();

    int quantity();

    double price();

    double taxes();

    boolean isImported();
}