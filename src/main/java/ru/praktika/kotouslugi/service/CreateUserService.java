package ru.praktika.kotouslugi.service;

import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.CreateUserRepository;
import ru.praktika.kotouslugi.model.CreateUser;
import ru.praktika.kotouslugi.model.Field;
import ru.praktika.kotouslugi.model.Requisition;
import ru.praktika.kotouslugi.model.enums.RequisitionStatus;

import java.util.*;

@Service
public class CreateUserService {

    @Autowired
    private CreateUserRepository createUserRepository;

    public void saveUser(Map<String, Object> request) {
        Requisition requisition = new Requisition("Заявление", RequisitionStatus.DRAFT, 1);
        request.forEach((s, o) -> {
            ((Map<String, Object>) o).forEach((s1, o1) -> {
                Field field = new Field(s1, o1.toString());
                requisition.getFields().add(field);
            });
        });
    }
    public void saveCreateUser(CreateUser createUser) {
        createUserRepository.save(createUser);
    }

    public List<CreateUser> getCreateUserList() {
        List<CreateUser> createUserList = new ArrayList<>();
        Iterable<CreateUser> createUsers = createUserRepository.findAll();
        createUsers.forEach(createUserList::add);
        return createUserList;
    }

    public CreateUser getCreateUser(Integer id) {
        return createUserRepository.findById(id).orElse(null);
    }

}
