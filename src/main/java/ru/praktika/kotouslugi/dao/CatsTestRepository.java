package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.CatsTest;
import ru.praktika.kotouslugi.model.Kittens;

public interface CatsTestRepository extends CrudRepository<Kittens, Integer> {
}
