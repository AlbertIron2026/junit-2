package com.ironhack.junit2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Junit2Application {

	public static void main(String[] args) {
		SpringApplication.run(Junit2Application.class, args);

		int edadPadre= 70;
		int edadMadre = 65;

		double edadMedia= (float)(70 + 65) / 2; 

		System.out.println("edad media de los padres:" + edadMedia);

	}

}
