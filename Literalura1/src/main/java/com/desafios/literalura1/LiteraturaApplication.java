package com.desafios.literalura1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafios.literalura1.principal.Principal;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Autowired
	private Principal principal;

	@Override
	public void run(String... args) throws Exception {
		principal.EjecutarAplicacion();
	}
}