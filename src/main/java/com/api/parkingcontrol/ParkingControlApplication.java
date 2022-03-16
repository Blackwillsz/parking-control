package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
@EnableWebSecurity
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
		
		System.out.println("\n\n\n\n\n-----------------------------------------------------------------------------------");
		System.out.println("API PARKING CONTROL INICIADA");
		System.out.println("@__willsz");
		System.out.println("-----------------------------------------------------------------------------------\n\n");
	}
	
	@GetMapping("/")
	public String index() {
		return "Hello World!";
	}

}
