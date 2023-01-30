package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.Kittens;
import ru.praktika.kotouslugi.model.Requisition;

public interface KittensRepository extends CrudRepository<Kittens, Integer> {
}
