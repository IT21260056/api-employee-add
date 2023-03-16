package com.mobile.apimobileshopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mobile.apimobileshopservice")
@EnableAutoConfiguration
public class ApiMobileShopServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiMobileShopServiceApplication.class, args);
	}

}
actjs