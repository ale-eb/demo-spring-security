package com.pantera.demospringsecurity.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column
  private String name;
}
