package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.KotopravaRequisition;

public interface KotopravaRepository extends CrudRepository<KotopravaRequisition, Long> {
}
