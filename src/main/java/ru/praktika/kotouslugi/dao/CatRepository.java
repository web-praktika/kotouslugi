package ru.praktika.kotouslugi.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.praktika.kotouslugi.model.Cat;

public interface CatRepository extends CrudRepository<Cat, Long> {

    @Query("from Cat c where c.name = :name")
    Cat getByName(@Param("name") String name);
}
