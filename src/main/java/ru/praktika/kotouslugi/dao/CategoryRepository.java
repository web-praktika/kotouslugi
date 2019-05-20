package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
