package ru.praktika.kotouslugi.dao;

import org.springframework.data.repository.CrudRepository;
import ru.praktika.kotouslugi.model.CreateUser;
public interface CreateUserRepository extends CrudRepository<CreateUser, Integer> {
}
