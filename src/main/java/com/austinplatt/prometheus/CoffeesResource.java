package com.austinplatt.prometheus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("coffee")
public class CoffeesResource {

    @GET
    public String getCoffee() {
        return Coffees.getInstance().retrieveCoffee();
    }

}
