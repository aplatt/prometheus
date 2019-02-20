package com.austinplatt.prometheus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("tea")
public class TeasResource {

    @GET
    public String getTea() {
        return Teas.getInstance().retrieveTea();
    }

}
