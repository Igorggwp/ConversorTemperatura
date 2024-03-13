package com.igorale.ConversorTemperatura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConversorTemperaturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversorTemperaturaApplication.class, args);
	}

}
