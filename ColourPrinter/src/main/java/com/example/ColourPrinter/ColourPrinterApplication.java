package com.example.ColourPrinter;

import com.example.ColourPrinter.services.ColourPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class ColourPrinterApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public ColourPrinterApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}


	public static void main(String[] args) {
		SpringApplication.run(ColourPrinterApplication.class, args);
	}

	@Override
	public void run(String... args){
		log.info(colourPrinter.print());

	}
}
