package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.Passport_dataRepository;
import ru.praktika.kotouslugi.model.Passport_dataEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class Passport_dataService {

    @Autowired
    private Passport_dataRepository Passport_dataRepository;

    public void savePassport_dataEntity(Passport_dataEntity Passport_dataEntity){
        Passport_dataRepository.save(Passport_dataEntity);
    }

    public List<Passport_dataEntity> getEntityList(){
        List<Passport_dataEntity> Passport_dataEntityList = new ArrayList<>();
        Iterable<Passport_dataEntity> entities = Passport_dataRepository.findAll();
        entities.forEach(Passport_dataEntityList::add);
        return Passport_dataEntityList;
    }

}
