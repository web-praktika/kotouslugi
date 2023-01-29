package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.TestRepository;
import ru.praktika.kotouslugi.model.TestEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository TestRepository;

    public void saveTestEntity(TestEntity TestEntity){
        TestRepository.save(TestEntity);
    }

    public List<TestEntity> getEntityList(){
        List<TestEntity> testEntityList = new ArrayList<>();
        Iterable<TestEntity> entities = TestRepository.findAll();
        entities.forEach(testEntityList::add);
        return testEntityList;
    }

}
