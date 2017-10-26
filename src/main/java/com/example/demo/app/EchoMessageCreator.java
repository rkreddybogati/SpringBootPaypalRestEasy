package com.example.demo.app;

import org.springframework.stereotype.Component;

/**
 * Created by srk on 26/10/17.
 */
@Component
public class EchoMessageCreator {
    public EchoMessage createEchoMessage(String echoText) {
        return new EchoMessage(echoText);
    }
}
