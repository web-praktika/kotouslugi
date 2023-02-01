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
    private TestRepository testRepository;

    public void saveTestEntity(TestEntity testEntity) {
        testRepository.save(testEntity);
    }

    public List<TestEntity> getEntityList() {
        List<TestEntity> testEntityList = new ArrayList<>();
        Iterable<TestEntity> entities = testRepository.findAll();
        entities.forEach(testEntityList::add);
        return testEntityList;
    }
}
