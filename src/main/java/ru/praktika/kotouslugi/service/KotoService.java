package ru.praktika.kotouslugi.service;

import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.model.KotoServiceEntity;

import java.util.LinkedList;
import java.util.List;

@Service
public class KotoService {

    public List<KotoServiceEntity> listUslugi() {
        List<KotoServiceEntity> entityList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            KotoServiceEntity entity = new KotoServiceEntity(i);
            entity.setName("Регистрация рождения котят");
            entity.setDescription("Подходи ответственно к регистрации потомства. При рождении треж и более котят вы можете получить субсидии в виде пачки корма.");
            entityList.add(entity);
        }
        return entityList;
    }
}
