package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.UserAdress;

public interface UserAddressRepository extends CrudRepository<UserAdress, Integer> {
}
