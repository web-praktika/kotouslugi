package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.OwnerFines;

public interface OwnersFinesRepository extends CrudRepository<OwnerFines, Integer> {
}
