package de.oderkerk.bpm.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TestApp {

	public static void main(String... args) {
		SpringApplication.run(TestApp.class, args);
	}

}
