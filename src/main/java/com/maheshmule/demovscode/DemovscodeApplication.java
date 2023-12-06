package com.maheshmule.demovscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemovscodeApplication {

	@GetMapping
	public String get() {
		return "Application running on the localhost ";

	}

	public static void main(String[] args) {
		SpringApplication.run(DemovscodeApplication.class, args);
	}

}
