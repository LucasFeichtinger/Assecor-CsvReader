package com.assecor.csvreader;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages={"com.assecor.service", "com.assecor.model", "com.assecor.csvreader"})
public class CsvReaderApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		SpringApplication.run(CsvReaderApplication.class, args);

	}

}
