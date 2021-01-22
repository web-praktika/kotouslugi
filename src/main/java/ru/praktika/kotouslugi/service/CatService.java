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

    public Cat getCat(Long id) {
        Optional<Cat> cat = catRepository.findById(id);
        if (cat.isPresent()) {
            return cat.get();
        }
        return null;
    }

    public Long setCat(Cat cat) {
        try {
            cat = catRepository.save(cat);
            logger.info("Добавлен кот %s с идентификатором %d", cat.getName(), cat.getId());
            return cat.getId();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public Boolean deleteCat(Cat cat) {
        try {
            catRepository.delete(cat);
            logger.info("Удален кот %s с идентификатором %d", cat.getName(), cat.getId());
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
        return true;
    }

    public List<Cat> listCat() {
        Iterable<Cat> all = catRepository.findAll();
        List<Cat> list = new LinkedList<>();
        all.forEach(cat -> {
            Cat myCat = new Cat();
            myCat.setId(cat.getId());
            myCat.setName(cat.getName());
            myCat.setAge(cat.getAge());
            list.add(myCat);
        });
        return list;
    }
}
