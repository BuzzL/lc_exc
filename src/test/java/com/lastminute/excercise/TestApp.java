package com.lastminute.excercise;

import com.lastminute.excercise.items.free.*;
import com.lastminute.excercise.items.taxable.*;

import org.junit.Test;
import org.junit.Assert;

public class TestApp {

    private void verify(Basket b, String expected) {
        String receipt = b.printReceipt();

        System.out.println("--------------------");
        System.out.println("Computed Receipt: ");
        System.out.println(receipt);
        System.out.println("--------------------");

        Assert.assertEquals(receipt, expected);
    }

    @Test
    public void test1() {

        Basket b = new Basket();

        b.addItem(new Book("The Lord of the rings", 1, 12.49, false));
        b.addItem(new CD("Californication", 1, 14.99, false));
        b.addItem(new ChocolateBar(1, 0.85, false));

        String expected =
                "1 book: 12.49\n" +
                "1 music CD: 16.49\n" +
                "1 chocolate bar: 0.85\n" +
                "Sales Taxes: 1.50\n" +
                "Total: 29.83\n";

        verify(b, expected);

    }

    @Test
    public void test2() {
        Basket b = new Basket();

        b.addItem(new ChocolateBox(1, 10.00, true));
        b.addItem(new Perfume("Dior", 1, 47.50, true));

        String expected =
                "1 imported box of chocolates: 10.50\n" +
                "1 imported bottle of perfume: 54.65\n" +
                "Sales Taxes: 7.65\n" +
                "Total: 65.15\n";

        verify(b, expected);
    }

    @Test
    public void test3() {
        Basket b = new Basket();

        b.addItem(new Perfume("Dior", 1, 27.99, true));
        b.addItem(new Perfume("Cavalli", 1, 18.99, false));
        b.addItem(new HeadachePills("", 1, 9.75, false));
        b.addItem(new ChocolateBox(1, 11.25, true));
        String expected =
                "1 imported bottle of perfume: 32.19\n" +
                "1 bottle of perfume: 20.89\n" +
                "1 packet of headache pills: 9.75\n" +
                "1 imported box of chocolates: 11.80\n" +
                "Sales Taxes: 6.65\n" +
                "Total: 74.63\n";
        verify(b, expected);
    }

}

