package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.LicenceRequisitionRepository;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.Field;
import ru.praktika.kotouslugi.model.LicenceRequisition;
import ru.praktika.kotouslugi.model.enums.LicenceRequisitionStatus;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class LicenceRequisitionService {

    @Autowired
    private LicenceRequisitionRepository licenceRequisitionRepository;

    public List<LicenceRequisition> listLicenceRequisition() {
        List<LicenceRequisition> result = new LinkedList<>();
        Iterable<LicenceRequisition> requisitions = licenceRequisitionRepository.findAll();
        requisitions.forEach(result::add);
        return result;
    }

    public int createLicenceRequisition(Map<String, Object> request) {

        LicenceRequisition licenceRequisition = new LicenceRequisition("Заявление", LicenceRequisitionStatus.DRAFT, 1);
        request.forEach((s, o) -> {
            switch (s) {
                case "name":
                    licenceRequisition.setName(o.toString());
                    break;
                case "status":
                    LicenceRequisitionStatus status = LicenceRequisitionStatus.valueOf(o.toString().toUpperCase());
                    licenceRequisition.setStatus(status);
                    break;
                case "fields":
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        Field field = new Field(s1, o1.toString());
                        licenceRequisition.getFields().add(field);
                    });
                    break;
                case "serviceId":
                    licenceRequisition.setServiceId((Integer) o);
                    break;
            }
        });

        LicenceRequisition save = licenceRequisitionRepository.save(licenceRequisition);
        return save.getId();
    }

    public Boolean updateLicenceRequisition(Map<String, Object> request) throws ServiceException {
        String id = String.valueOf(request.get("id"));
        if (id == null || id.isEmpty() || id.equals("null"))
            throw new ServiceException("Не указан id заявки");
        Integer idLicenceRequisite = Integer.parseInt(id);
        LicenceRequisition licenceRequisition = licenceRequisitionRepository.findById(idLicenceRequisite).orElse(null);
        if (licenceRequisition == null)
            throw new ServiceException("Указанная заявка не найдена: " + idLicenceRequisite);

        request.forEach((s, o) -> {
            switch (s) {
                case "name":
                    licenceRequisition.setName(o.toString());
                    break;
                case "status":
                    licenceRequisition.setStatus(LicenceRequisitionStatus.valueOf(o.toString().toUpperCase()));
                    break;
                case "fields":
                    licenceRequisition.getFields().clear();
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        Field field = new Field(s1, o1.toString());
                        licenceRequisition.getFields().add(field);
                    });
                    break;
            }
        });
        licenceRequisitionRepository.save(licenceRequisition);

        return true;
    }
}
