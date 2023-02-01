package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.TestEntity;

public interface TestRepository extends CrudRepository<TestEntity, Integer> {

}
