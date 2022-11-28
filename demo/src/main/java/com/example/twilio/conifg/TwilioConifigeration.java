package com.example.twilio.conifg;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
@Setter
@Getter
public class TwilioConifigeration {

    private String accountSid;
    private String authtoken;
    private String trialnumber;
}
