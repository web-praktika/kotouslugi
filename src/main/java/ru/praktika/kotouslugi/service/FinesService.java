package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.FinesRepository;
import ru.praktika.kotouslugi.model.CreateCat;
import ru.praktika.kotouslugi.model.Fines;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FinesService {

    @Autowired
    private FinesRepository finesRepository;

    public void saveFine(Fines fines) {
        finesRepository.save(fines);
    }

    public List<Fines> getFines() {
        List<Fines> finesList = new ArrayList<>();
        Iterable<Fines> fines = finesRepository.findAll();
        fines.forEach(finesList::add);
        return finesList;
    }

    public void deleteFine (Integer id) {
        Optional<Fines> fine = finesRepository.findById(id);
        if (fine.isPresent()) {
            finesRepository.delete(fine.get());
        }
    }


    public Fines getFinesByID(Integer id) {
        return finesRepository.findById(id).orElse(null);
    }

}
