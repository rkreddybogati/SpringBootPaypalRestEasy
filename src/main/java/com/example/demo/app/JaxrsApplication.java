package com.example.demo.app;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by srk on 26/10/17.
 */
@Component
@ApplicationPath("/")
public class JaxrsApplication extends Application {
}
