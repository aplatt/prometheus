package com.austinplatt.prometheus;

import io.prometheus.client.Counter;

public class Teas {

    private static Counter consumedTeas;
    private static Teas instance;

    private Teas() {
        consumedTeas = Counter.build("total_teas_consumed", "Total number of consumed teas").register();
    }

    public static Teas getInstance() {
        if (instance == null) {
            instance = new Teas();
        }
        return instance;
    }

    public String retrieveTea() {
        consumedTeas.inc();
        return "Tea!";
    }

}
