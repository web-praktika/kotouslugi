package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.Replacement_applicationRepository;
import ru.praktika.kotouslugi.model.Replacement_applicationEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class Replacement_applicationService {

    @Autowired
    private Replacement_applicationRepository Replacement_applicationRepository;

    public void saveReplacement_applicationEntity(Replacement_applicationEntity Replacement_applicationEntity){
        Replacement_applicationRepository.save(Replacement_applicationEntity);
    }

    public List<Replacement_applicationEntity> getEntityList(){
        List<Replacement_applicationEntity> Replacement_applicationEntityList = new ArrayList<>();
        Iterable<Replacement_applicationEntity> entities = Replacement_applicationRepository.findAll();
        entities.forEach(Replacement_applicationEntityList::add);
        return Replacement_applicationEntityList;
    }

}