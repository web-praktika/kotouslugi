package ru.praktika.kotouslugi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.PersonRepository;
import ru.praktika.kotouslugi.model.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private static final Logger logger = LoggerFactory.getLogger(PersonService.class);

    @Autowired
    private PersonRepository personRepository;

    public List<Person> listPerson() {
        List<Person> list = new LinkedList<>();
        Iterable<Person> all = personRepository.findAll();
        all.forEach(person -> {
            list.add(person);
        });
        return list;
    }

    public Long addPerson(Person person) {
        try {
            person = personRepository.save(person);
            return person.getPersonId();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public Person getPerson(Long personId) {
        Optional<Person> person = personRepository.findById(personId);
        if (person.isPresent()) {
            return person.get();
        }
        return null;
    }

    public void deletePerson(Long personId) {
        Optional<Person> person = personRepository.findById(personId);
        if (person.isPresent()) {
            personRepository.delete(person.get());
        }
    }
}
