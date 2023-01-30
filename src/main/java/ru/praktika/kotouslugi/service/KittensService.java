package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.KittensRepository;
import ru.praktika.kotouslugi.model.Kittens;

@Service
public class KittensService {

    @Autowired
    private KittensRepository kittensRepository;

    public void saveKittensData(Kittens kittens) {
        kittensRepository.save(kittens);
    }
}
