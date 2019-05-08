package com.ibm.openwhisk.quarkus.jpa.sample;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/init")
public class Init {

    @POST
    public String init() {
        return "";
    }
}
