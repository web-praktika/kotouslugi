package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
