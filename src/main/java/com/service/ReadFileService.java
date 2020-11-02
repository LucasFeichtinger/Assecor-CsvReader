package com.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.model.Person;

@Service
public class ReadFileService implements IPersonService {

	public List<Person> findAll() throws IOException {

		String path = ".\\sample-input.csv";
		String line = "";
		List<Person> personl = new ArrayList<Person>(); 

		BufferedReader csvReader = new BufferedReader(new FileReader(path));

		while((line = csvReader.readLine()) != null) {
			String[] values = line.split(",");

			values[2] = values[2].replaceAll("\\n", "");
			values[3] = values[3].replaceAll("\\s+", "");

			if(values[3].equals("1")) {
				personl.add(new Person(values[0], values[1], values[2], "Blau"));
			}
			else if(values[3].equals("2")) {
				personl.add(new Person(values[0], values[1], values[2], "Grün"));
			}
			else if(values[3].equals("3")) {
				personl.add(new Person(values[0], values[1], values[2], "Violett"));
			}
			else if(values[3].equals("4")) {
				personl.add(new Person(values[0], values[1], values[2], "Rot"));
			}
			else if(values[3].equals("5")) {
				personl.add(new Person(values[0], values[1], values[2], "Gelb"));
			}
			else if(values[3].equals("6")) {
				personl.add(new Person(values[0], values[1], values[2], "Türkis"));
			}
			else if(values[3].equals("7")) {
				personl.add(new Person(values[0], values[1], values[2], "Weiß"));
			}
		}

		csvReader.close();

		return personl;
	}
}