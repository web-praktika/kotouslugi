package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.KotoServiceRepository;
import ru.praktika.kotouslugi.model.KotoServiceEntity;

import java.util.LinkedList;
import java.util.List;

@Service
public class KotoService {

    @Autowired
    private KotoServiceRepository kotoServiceRepository;

    public List<KotoServiceEntity> listServices() {
        List<KotoServiceEntity> entityList = new LinkedList<>();
        Iterable<KotoServiceEntity> serviceEntities = kotoServiceRepository.findAll();
        serviceEntities.forEach(entityList::add);
        return entityList;
    }
}
