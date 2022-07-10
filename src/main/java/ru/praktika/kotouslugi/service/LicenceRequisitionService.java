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
import java.util.Map;

@Service
public class LicenceRequisitionService {

    @Autowired
    private LicenceRequisitionRepository licenceRequisitionRepository;
    @Autowired
    private PersonRepository personRepository;

    public List<LicenceRequisition> listLicenceRequisition() {
        List<LicenceRequisition> result = new LinkedList<>();
        Iterable<LicenceRequisition> requisitions = licenceRequisitionRepository.findAll();
        requisitions.forEach(result::add);
        return result;
    }

    public Long createLicenceRequisition(Map<String, Object> request) {

        LicenceRequisition licenceRequisition = new LicenceRequisition(LicenceRequisitionStatus.DRAFT);
        request.forEach((s, o) -> {
            switch (s) {
                case "status":
                    LicenceRequisitionStatus status = LicenceRequisitionStatus.valueOf(o.toString().toUpperCase());
                    licenceRequisition.setStatus(status);
                    break;
                case "personId":
                    Long personId = (Long) o;
                    Person person = personRepository.findById(personId).orElse(null);
                    if (person == null)
                        try {
                            throw new ServiceException("Указанный паспорт не найден: " + personId);
                        } catch (ServiceException e) {
                            throw new RuntimeException(e);
                        }
                    licenceRequisition.setPersonId((Long) o);
                    break;
                case "licenceId":
                    licenceRequisition.setLicenceId((Long) o);
                    break;
                case "licenceN":
                    licenceRequisition.setLicenceN((Long) o);
                    break;
            }
        });
        licenceRequisition.setCreationDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

        LicenceRequisition save = licenceRequisitionRepository.save(licenceRequisition);
        return save.getLicenceN();
    }

    public Boolean updateLicenceRequisition(Map<String, Object> request) throws ServiceException {
        String id = String.valueOf(request.get("id"));
        if (id == null || id.isEmpty() || id.equals("null"))
            throw new ServiceException("Не указан id заявки");
        Long idLicenceRequisite = Long.parseLong(id);
        LicenceRequisition licenceRequisition = licenceRequisitionRepository.findById(idLicenceRequisite).orElse(null);
        if (licenceRequisition == null)
            throw new ServiceException("Указанная заявка не найдена: " + idLicenceRequisite);

        request.forEach((s, o) -> {
            switch (s) {
                case "status":
                    LicenceRequisitionStatus status = LicenceRequisitionStatus.valueOf(o.toString().toUpperCase());
                    licenceRequisition.setStatus(status);
                    break;
                case "personId":
                    licenceRequisition.setPersonId((Long) o);
                    break;
                case "licenceId":
                    licenceRequisition.setLicenceId((Long) o);
                    break;
                case "licenceN":
                    licenceRequisition.setLicenceN((Long) o);
                    break;
            }
        });
        licenceRequisition.setCreationDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
        licenceRequisitionRepository.save(licenceRequisition);

        return true;
    }
}
