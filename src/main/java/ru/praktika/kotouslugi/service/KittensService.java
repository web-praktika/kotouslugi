package ru.praktika.kotouslugi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.KittensRepository;
import ru.praktika.kotouslugi.model.Kittens;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;



//ВСЕ ПЛОХО ЭТО УДАЛИТЬ!!
@Service
public class KittensService {
    private static final Logger logger = LoggerFactory.getLogger(KittensService.class);

    @Autowired
    private KittensRepository kittensRepository;

    //public void saveKittensData(Kittens kittens) {
      //  kittensRepository.save(kittens);
    //}

    public List<Kittens> listCat() {
        List<Kittens> list = new LinkedList<>();
        Iterable<Kittens> all = kittensRepository.findAll();
        all.forEach(cat -> {
            list.add(cat);
        });
        return list;
    }

    public Long addKitten(Kittens cat) {
        try {
            cat = kittensRepository.save(cat);

            return cat.getId();
        } catch (Exception e) {
            return null;
        }
    }

    public Kittens getCat(Long id) {
        Optional<Kittens> cat = kittensRepository.findById(id);
        if (cat.isPresent()) {
            return cat.get();
        }
        return null;
    }
}
