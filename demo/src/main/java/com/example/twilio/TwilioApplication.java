package com.example.twilio;

import com.example.twilio.conifg.TwilioConifigeration;
import com.twilio.Twilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TwilioApplication {

	@Autowired
	private TwilioConifigeration TwilioConifigeration;

	@PostConstruct
	public void initTwilio(){
		Twilio.init(TwilioConifigeration.getAccountSid(),TwilioConifigeration.getAuthtoken());
	}

	public static void main(String[] args) {

		SpringApplication.run(TwilioApplication.class, args);
	}

}
