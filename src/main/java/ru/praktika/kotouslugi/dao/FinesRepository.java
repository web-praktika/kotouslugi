package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.Fines;

public interface FinesRepository extends CrudRepository<Fines, Integer> {
}
