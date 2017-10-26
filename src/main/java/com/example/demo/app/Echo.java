package com.example.demo.app;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by srk on 26/10/17.
 */
@Path("/echo")
public interface Echo {

   /* @Autowired
    private EchoMessageCreator echoer;

    *//**
     * Receives a simple POST request message containing as payload
     * a text, in text plain format, to be echoed by the service.
     * It returns as response, in JSON, the text to be echoed plus a timestamp of the
     * moment the echo response was created on the server side
     *
     * @param echoText
     * @return
     *//*
    @POST
    @Consumes({ MediaType.TEXT_PLAIN })
    @Produces({ MediaType.APPLICATION_JSON })
    public EchoMessage echo(@NotEmpty String echoText) {
        return echoer.createEchoMessage(echoText);
    }

    @GET
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/name/{givenname}")
    public String getYourName(@PathParam("givenname") String givenname) {
        return "Your Name is : "+ givenname;
    }

    @GET
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/name/{givenname}/query")
    public String getYourNameWithAge(@PathParam("givenname") String givenname, @QueryParam("age") String age) {
        return "Your Name is : "+ givenname + " and Your age is : "+age;
    } */



    @GET
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/name/{givenname}")
    public String getYourName(@PathParam("givenname") String givenname);

    @GET
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/name/{givenname}/query")
    public String getYourNameWithAge(@PathParam("givenname") String givenname, @QueryParam("age") String age);
}

