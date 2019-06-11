package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.Requisition;

public interface RequisitionRepository extends CrudRepository<Requisition, Integer> {
}
