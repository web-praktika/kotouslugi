package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.Cat;

public interface CatRepository extends CrudRepository<Cat, Long> {

}
