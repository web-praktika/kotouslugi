package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.KotoServiceEntity;

public interface KotoServiceRepository extends CrudRepository<KotoServiceEntity, Long> {

}
