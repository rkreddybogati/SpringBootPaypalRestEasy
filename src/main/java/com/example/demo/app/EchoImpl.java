package com.example.demo.app;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by srk on 26/10/17.
 */
@Controller
public class EchoImpl implements Echo {

    @Override
    public String getYourName(String givenname) {
        return "Your Name is : "+ givenname;
    }

    @Override
    public String getYourNameWithAge(String givenname, String age) {
        return "Your Name is : "+ givenname + " and Your age is : "+age;
    }

}
