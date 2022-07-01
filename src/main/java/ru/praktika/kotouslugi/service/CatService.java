package ru.praktika.kotouslugi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.CatRepository;
import ru.praktika.kotouslugi.model.Cat;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class CatService {
    private static final Logger logger = LoggerFactory.getLogger(CatService.class);

    @Autowired
    private CatRepository catRepository;

    public List<Cat> listCat() {
        List<Cat> list = new LinkedList<>();
        Iterable<Cat> all = catRepository.findAll();
        all.forEach(cat -> {
            list.add(cat);
        });
        return list;
    }

    public Long addCat(Cat cat) {
        try {
            cat = catRepository.save(cat);
            logger.info("Добавлен кот = ", cat.getName());
            return cat.getId();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public Cat getCat(Long id) {
        Optional<Cat> cat = catRepository.findById(id);
        if(cat.isPresent()) {
            return cat.get();
        }
        return null;
    }

    public void deleteCat(Long id) {
        Optional<Cat> cat = catRepository.findById(id);
        if (cat.isPresent()) {
            catRepository.delete(cat.get());
        }
    }
}
