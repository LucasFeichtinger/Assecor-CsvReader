package com.assecor.csvreader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assecor.model.Person;
import com.assecor.service.IPersonService;

@RestController
public class CsvController {

	@Autowired
	private IPersonService service;


	@GetMapping ("/persons")
	public List<Person> getPeople() throws IOException {

		List<Person> persons = service.findAll();

		return persons;
	}

	@RequestMapping ("/person/{id}")
	public Person getPeopleId( @PathVariable("id") Integer id ) throws IOException {
		List<Person> persons = service.findAll();

		return persons.get(id);
	}

	@RequestMapping ("/persons/color/{color}")
	public List<Person> getPeopleColor(@PathVariable("color") String color) throws IOException {

		List<Person> persons = service.findAll();

		List<Person> farbe = new ArrayList<Person>(); 

		for (Person person : persons) {

			if ( person.getColor().equals(color)) {

				farbe.add(person);
			}
		}
		return farbe;
	}

}
