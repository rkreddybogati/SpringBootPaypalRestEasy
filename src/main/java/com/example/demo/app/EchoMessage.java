package com.example.demo.app;

import org.springframework.stereotype.Component;

/**
 * Created by srk on 26/10/17.
 */
public class EchoMessage {
    private long timestamp;
    private String echoText;

    public EchoMessage(String echoText) {
        timestamp = System.currentTimeMillis();
        this.echoText = echoText;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getEchoText() {
        return echoText;
    }
}
