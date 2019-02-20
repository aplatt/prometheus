package com.austinplatt.prometheus;

import io.prometheus.client.Counter;

public class Coffees {

    private static Counter consumedCoffees;
    private static Coffees instance;

    private Coffees() {
        consumedCoffees = Counter.build("total_coffees_consumed", "Total number of consumed coffees").register();
    }

    public static Coffees getInstance() {
        if (instance == null) {
            instance = new Coffees();
        }
        return instance;
    }

    public String retrieveCoffee() {
        consumedCoffees.inc();
        return "Coffee!";
    }

}
