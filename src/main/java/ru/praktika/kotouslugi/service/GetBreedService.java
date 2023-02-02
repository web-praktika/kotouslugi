package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.GetBreedRepository;
import ru.praktika.kotouslugi.model.GetBreed;
import java.util.*;
@Service
public class GetBreedService {

    @Autowired
    private GetBreedRepository getBreedRepository;

    public List<GetBreed> getBreedsList() {
        List<GetBreed> getBreedList = new ArrayList<>();
        Iterable<GetBreed> getBreeds = getBreedRepository.findAll();
        getBreeds.forEach(getBreedList::add);
        return getBreedList;
    }
}
