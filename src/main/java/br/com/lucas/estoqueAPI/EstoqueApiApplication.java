package br.com.lucas.estoqueAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstoqueApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoqueApiApplication.class, args);
		System.out.println("Running");
	}

}
