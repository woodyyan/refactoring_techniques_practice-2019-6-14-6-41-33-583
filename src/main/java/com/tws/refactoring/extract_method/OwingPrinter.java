package com.tws.refactoring.extract_method;

import java.util.Iterator;
import java.util.List;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;

        printBanner();

        // print owings
        while (elements.hasNext()) {
            Order each = elements.next();
            outstanding += each.getAmount();
        }

        printDetails("name: " + name, "amount: " + outstanding);
    }

    private void printBanner() {
        System.out.println("*****************************");
        System.out.println("****** Customer totals ******");
        System.out.println("*****************************");
    }

    private void printDetails(String name, String amount) {
        System.out.println(name);
        System.out.println(amount);
    }
}