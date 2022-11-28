package com.example.email.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);
        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put("LINE", new ArrayList<>());
        map.get("LINE").add("hello");
        // System.out.println(map.get("LINE"));
        Map<String, ArrayList<String>> map2 = new HashMap<>();
        map2.put("LINE", new ArrayList<>());
        map2.get("LINE").add("hai");
        // System.out.println(map.get("LINE"));
        Map<String, ArrayList<String>> map3 = new HashMap<>();
        map3.put("LINE", new ArrayList<>());
        map3.get("LINE").add("manakanta");
        Map<String, ArrayList<String>> map4 = new HashMap<>();
        map4.put("LINE", new ArrayList<>());
        map4.get("LINE").add("this the mail");
        Map<String, ArrayList<String>> map5 = new HashMap<>();
        map5.put("LINE", new ArrayList<>());
        map5.get("LINE").add("thanks");
        List<Object> emailTriggring = new ArrayList<Object>();
        emailTriggring.add(map);
        emailTriggring.add(map2);
        emailTriggring.add(map3);
        emailTriggring.add(map4);
        emailTriggring.add(map5);
        // System.out.println(emailTriggring);
        Map<String, Object> email = new HashMap<>();
        email.put("IM_SENDER", "NAVYA");
        email.put("IM_RECIVER", "JAYA SURYA");
        email.put("IM_SUBJECT", "Subject for email");
        email.put("IT_BODY", emailTriggring);
        System.out.println(email);
        System.out.println(email.get("IT_BODY"));


    }

}
