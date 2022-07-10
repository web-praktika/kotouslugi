package ru.praktika.kotouslugi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Person;
import ru.praktika.kotouslugi.service.PersonService;

import java.util.List;


@RestController
@RequestMapping("/personService")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "listPerson", method = RequestMethod.POST, produces = "application/json")
    public List<Person> listPerson() {
        List<Person> persons = personService.listPerson();
        return persons;
    }

    @RequestMapping(value = "addPerson", method = RequestMethod.POST, produces = "application/json")
    public Long addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @RequestMapping(value = "getPerson", method = RequestMethod.GET, produces = "application/json")
    public Person getPerson(@RequestParam Long personId) {
        return personService.getPerson(personId);
    }

    @RequestMapping(value = "deletePerson", method = RequestMethod.DELETE, produces = "application/json")
    public void deletePerson(@RequestParam Long personId) {
        personService.deletePerson(personId);
    }
}