package com.pantera.demospringsecurity.repository;

import com.pantera.demospringsecurity.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
