package ru.praktika.kotouslugi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.LicenceRepository;
import ru.praktika.kotouslugi.model.Licence;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class LicenceService {
    private static final Logger logger = LoggerFactory.getLogger(LicenceService.class);

    @Autowired
    private LicenceRepository licenceRepository;

    public List<Licence> listLicence() {
        List<Licence> list = new LinkedList<>();
        Iterable<Licence> all = licenceRepository.findAll();
        all.forEach(licence -> {
            list.add(licence);
        });
        return list;
    }

    public Long addLicence(Licence licence) {
        try {
            licence = licenceRepository.save(licence);
            logger.info("Добавлена лицензия = ", licence.getName());
            return licence.getLicenceId();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public Licence getLicence(Long id) {
        Optional<Licence> licence = licenceRepository.findById(id);
        if (licence.isPresent()) {
            return licence.get();
        }
        return null;
    }

    public void deleteLicence(Long id) {
        Optional<Licence> licence = licenceRepository.findById(id);
        if (licence.isPresent()) {
            licenceRepository.delete(licence.get());
        }
    }
}
