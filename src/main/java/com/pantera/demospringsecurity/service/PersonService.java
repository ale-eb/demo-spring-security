package com.pantera.demospringsecurity.service;

import com.pantera.demospringsecurity.domain.Person;

import java.util.List;

public interface PersonService {

  Person save(Person person);

  List<Person> getAll();
}
