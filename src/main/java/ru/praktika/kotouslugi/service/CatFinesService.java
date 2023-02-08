package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.CatFinesRepository;
import ru.praktika.kotouslugi.model.CatFines;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatFinesService {

    @Autowired
    private CatFinesRepository catFinesRepository;

    public void saveCatFine(CatFines catFines) {
        catFinesRepository.save(catFines);
    }

    public List<CatFines> getCatFine() {
        List<CatFines> createCatFines = new ArrayList<>();
        Iterable<CatFines> catFines = catFinesRepository.findAll();
        catFines.forEach(createCatFines::add);
        return createCatFines;
    }


    public CatFines getCatFineByID(Integer id) {
        return catFinesRepository.findById(id).orElse(null);
    }
}
