package com.tacdesarrollo.tac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacApplication.class, args);
		System.out.println("app arranca...");
	}

}
