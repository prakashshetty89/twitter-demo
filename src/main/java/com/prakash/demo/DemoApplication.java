package com.prakash.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("java.net.useSystemProxies", "true");
		SpringApplication.run(DemoApplication.class, args);
	}

}
