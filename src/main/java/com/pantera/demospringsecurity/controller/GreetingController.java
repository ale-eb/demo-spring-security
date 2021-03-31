package com.pantera.demospringsecurity.controller;

import com.pantera.demospringsecurity.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

  @Autowired
  private PersonService personService;

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }

  @GetMapping("/listar")
  public String getAll(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    model.addAttribute("persons", personService.getAll());
    return "greeting";
  }
}
