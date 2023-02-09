package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.CreateCat;
public interface CreateCatRepository extends CrudRepository<CreateCat, Integer>{
}
