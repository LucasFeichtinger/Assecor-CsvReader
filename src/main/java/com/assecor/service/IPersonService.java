package com.assecor.service;

import java.io.IOException;
import java.util.List;
import com.assecor.model.Person;

public interface IPersonService {
	
    List<Person> findAll() throws IOException;
    
}


