package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.Kittens;
import ru.praktika.kotouslugi.model.Requisition;


//ВСЕ ПЛОХО ЭТО УДАЛИТЬ!!
public interface KittensRepository extends CrudRepository<Kittens, Long> {
}
