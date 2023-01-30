package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.Cat_inf1Repository;
import ru.praktika.kotouslugi.model.Cat_inf1Entity;

import java.util.ArrayList;
import java.util.List;

@Service
public class Cat_inf1Service {

    @Autowired
    private Cat_inf1Repository Cat_inf1Repository;

    public void saveCat_inf1Entity(Cat_inf1Entity Cat_inf1Entity){
        Cat_inf1Repository.save(Cat_inf1Entity);
    }

    public List<Cat_inf1Entity> getEntityList(){
        List<Cat_inf1Entity> catinf1EntityList = new ArrayList<>();
        Iterable<Cat_inf1Entity> entities = Cat_inf1Repository.findAll();
        entities.forEach(catinf1EntityList::add);
        return catinf1EntityList;
    }

}
