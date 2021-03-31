package com.pantera.demospringsecurity.service.impl;

import com.pantera.demospringsecurity.domain.Person;
import com.pantera.demospringsecurity.repository.PersonRepository;
import com.pantera.demospringsecurity.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  public PersonServiceImpl(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public Person save(Person person) {
    return personRepository.save(person);
  }

  @Override
  public List<Person> getAll() {
    return personRepository.findAll();
  }
}
