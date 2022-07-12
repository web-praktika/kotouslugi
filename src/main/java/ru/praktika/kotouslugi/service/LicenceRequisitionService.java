package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.LicenceRequisitionRepository;
import ru.praktika.kotouslugi.dao.PersonRepository;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.LicenceRequisition;
import ru.praktika.kotouslugi.model.Person;
import ru.praktika.kotouslugi.model.enums.LicenceRequisitionStatus;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class LicenceRequisitionService {

    @Autowired
    private LicenceRequisitionRepository licenceRequisitionRepository;
    @Autowired
    private PersonRepository personRepository;

    public List<LicenceRequisition> listLicenceRequisition() {
        List<LicenceRequisition> list = new LinkedList<>();
        Iterable<LicenceRequisition> all = licenceRequisitionRepository.findAll();
        all.forEach(licenceRequisition -> {
            list.add(licenceRequisition);
        });
        return list;
    }

    public Long createLicenceRequisition(LicenceRequisition licenceRequisition) {
        try {
            licenceRequisition.setStatus(LicenceRequisitionStatus.DRAFT);
            licenceRequisition.setCreationDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
            Optional<Person> person = personRepository.findById(licenceRequisition.getPassportData());
            if (person.isPresent()) {
                licenceRequisition = licenceRequisitionRepository.save(licenceRequisition);
                return licenceRequisition.getLicenceN();
            }
            return null;
        } catch (Exception e) {
            return null;
        }

    }

    public Boolean updateLicenceRequisition(LicenceRequisition licenceRequisition) throws ServiceException {
        String id = String.valueOf(licenceRequisition.getLicenceN());
        if (id == null || id.isEmpty() || id.equals("null"))
            throw new ServiceException("Не указан id заявки");
        Long idLicenceRequisite = licenceRequisition.getLicenceN();
        licenceRequisition = licenceRequisitionRepository.findById(idLicenceRequisite).orElse(null);
        if (licenceRequisition == null) {
            throw new ServiceException("Указанная заявка не найдена: " + idLicenceRequisite);
        }
        licenceRequisition.setCreationDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
        licenceRequisitionRepository.save(licenceRequisition);
        return true;
    }
}
