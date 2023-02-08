package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.CatFines;

public interface CatFinesRepository extends CrudRepository<CatFines, Integer> {
}
