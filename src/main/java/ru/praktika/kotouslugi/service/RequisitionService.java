package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.RequisitionRepository;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.Field;
import ru.praktika.kotouslugi.model.Requisition;
import ru.praktika.kotouslugi.model.enums.RequisitionStatus;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class RequisitionService {

    @Autowired
    private RequisitionRepository requisitionRepository;

    public List<Requisition> listRequisition() {
        List<Requisition> result = new LinkedList<>();
        Iterable<Requisition> requisitions = requisitionRepository.findAll();
        requisitions.forEach(result::add);
        return result;
    }

    public int createRequisition(Map<String, Object> request) {

        Requisition requisition = new Requisition("Заявление", RequisitionStatus.DRAFT, 1);
        request.forEach((s, o) -> {
            switch (s) {
                case "name":
                    requisition.setName(o.toString());
                    break;
                case "status":
                    RequisitionStatus status = RequisitionStatus.valueOf(o.toString().toUpperCase());
                    requisition.setStatus(status);
                    break;
                case "fields":
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        Field field = new Field(s1, o1.toString());
                        requisition.getFields().add(field);
                    });
                    break;
                case "serviceId":
                    requisition.setServiceId((Integer) o);
                    break;
                case "time":
                    requisition.setTime((String) o);
                    break;
                case "desc":
                    requisition.setDesc((String) o);
                    break;
            }
        });

        Requisition save = requisitionRepository.save(requisition);
        return save.getId();
    }

    public Boolean updateRequisition(Map<String, Object> request) throws ServiceException {
        String id = String.valueOf(request.get("id"));
        if (id == null || id.isEmpty() || id.equals("null"))
            throw new ServiceException("Не указан id заявки");
        Integer idRequisite = Integer.parseInt(id);
        Requisition requisition = requisitionRepository.findById(idRequisite).orElse(null);
        if (requisition == null)
            throw new ServiceException("Указанная заявка не найдена: " + idRequisite);

        request.forEach((s, o) -> {
            switch (s) {
                case "name":
                    requisition.setName(o.toString());
                    break;
                case "status":
                    requisition.setStatus(RequisitionStatus.valueOf(o.toString().toUpperCase()));
                    break;
                case "fields":
                    requisition.getFields().clear();
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        Field field = new Field(s1, o1.toString());
                        requisition.getFields().add(field);
                    });
                    break;
            }
        });
        requisitionRepository.save(requisition);

        return true;
    }
}
