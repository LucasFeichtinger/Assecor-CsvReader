package com.service;

import java.io.IOException;
import java.util.List;

import com.model.Person;

public interface IPersonService {
	
    List<Person> findAll() throws IOException;
    
}


