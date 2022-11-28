package com.example.demo;

import java.io.File;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BabuApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabuApplication.class, args);
		try {
			// Creating an object of a file
			File f0 = new File("E:babu.xls");
			if (f0.createNewFile()) {
				System.out.println("File " + f0.getName() + " is created successfully.");
			} else {
				System.out.println("File is already exist in the directory.");
			}
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred.");
			exception.printStackTrace();
		}
		
		String text = "hello educative";
        String sep = "l";
        System.out.printf(text, sep, StringUtils.substringBefore(text, sep));
        System.out.printf(text, sep, StringUtils.substringAfter(text, sep));
//        sep = null;
//        System.out.printf(text, sep, StringUtils.substringBefore(text, sep));
//        sep = "$";
//        System.out.printf(text, sep, StringUtils.substringBefore(text, sep));
	}

}
