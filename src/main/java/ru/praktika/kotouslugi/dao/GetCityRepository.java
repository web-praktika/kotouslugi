package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.GetCity;

public interface GetCityRepository  extends CrudRepository<GetCity, Integer> {
}
