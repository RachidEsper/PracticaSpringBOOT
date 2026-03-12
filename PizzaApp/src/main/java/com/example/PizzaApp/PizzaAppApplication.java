package com.example.PizzaApp;

import com.example.PizzaApp.Config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PizzaAppApplication implements CommandLineRunner {

	private PizzaConfig pizzaConfig;

	public PizzaAppApplication(PizzaConfig pizzaConfig) {
		this.pizzaConfig = pizzaConfig;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(String.format("I want a %s crust Pizza, with %s and %s sauce",
						pizzaConfig.getCrust(),
						pizzaConfig.getTopping(),
						pizzaConfig.getSauce())
				);

	}

	public static void main(String[] args) {
		SpringApplication.run(PizzaAppApplication.class, args);
	}

}
