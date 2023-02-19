package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.CatsTestRepository;
import ru.praktika.kotouslugi.model.CatsTest;
import ru.praktika.kotouslugi.model.Kittens;

import java.util.Map;
import java.util.Optional;

@Service
public class CatsTestService{

    @Autowired
    CatsTestRepository catsTestRepository;

    public Integer createCatTest(Map<String, Object> request) {
        Kittens kittens = new Kittens();
        request.forEach((str, obj) -> {
            /*if (str == "name") {
                kittens.setName(obj.toString());
            }
            else if (str == "breed") {
                kittens.setBreed(obj.toString());
            }
            else if (str == "sex") {
                kittens.setSex(obj.toString());
            }
            else if (str == "age") {
                kittens.setAge(obj.toString());
            }*/
            switch (str) {
                case "name":
                    kittens.setName(obj.toString());
                    break;
                case "breed":
                    kittens.setBreed(obj.toString());
                    break;
                case "sex":
                    kittens.setSex(obj.toString());
                    break;
                case "age":
                    kittens.setAge(obj.toString());
                    break;
            }
        });

        Kittens kittensSave = catsTestRepository.save(kittens);
        return kittensSave.getId();
    }

    public Integer addCatTest(Kittens kittens) {
        kittens = catsTestRepository.save(kittens);
        return kittens.getId();
    }

    public Kittens getCatTest(Integer id) {
        Optional<Kittens> catsTest = catsTestRepository.findById(id);
        if(catsTest.isPresent()) {
            return catsTest.get();
        }
        return null;
    }
}
