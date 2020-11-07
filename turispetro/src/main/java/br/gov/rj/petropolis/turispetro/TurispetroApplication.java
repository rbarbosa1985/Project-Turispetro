package br.gov.rj.petropolis.turispetro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TurispetroApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurispetroApplication.class, args);
	}

}
