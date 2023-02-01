package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.KotopravaRepository;
import ru.praktika.kotouslugi.dao.RequisitionRepository;
import ru.praktika.kotouslugi.model.*;
import ru.praktika.kotouslugi.model.enums.RequisitionStatus;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class KotopravaService {
    @Autowired
    private KotopravaRepository kotopravaRepository;

    public List<KotopravaRequisition> listPravaRequisition() {
        List<KotopravaRequisition> result = new LinkedList<>();
        Iterable<KotopravaRequisition> kotopravaRequisitions = kotopravaRepository.findAll();
        kotopravaRequisitions.forEach(result::add);
        return result;
    }

    public Long createPravaRequisition(Map<String, Object> request){
        KotopravaRequisition kotopravaRequisition = new KotopravaRequisition("Заявление", RequisitionStatus.DRAFT, " ", " ", " ", 6);
        request.forEach((s, o) -> {
            switch (s) {
                case "name":
                    kotopravaRequisition.setName(o.toString());
                    break;
                case "status":
                    RequisitionStatus status = RequisitionStatus.valueOf(o.toString().toUpperCase());
                    kotopravaRequisition.setStatus(status);
                    break;
                case "kittens":
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        Kittens kittens = new Kittens(s1, o1.toString());
                        kotopravaRequisition.getKittens().add(kittens);
                    });
                    break;
                case "passports":
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        CatPassport passports = new CatPassport(s1, o1.toString());
                        kotopravaRequisition.getPassports().add(passports);
                    });
                    break;
                case "certificates":
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        Certificates certificates = new Certificates(s1, o1.toString());
                        kotopravaRequisition.getCertificates().add(certificates);
                    });
                    break;
                case "num_otdelGIBDD":
                    kotopravaRequisition.setNumGIBDD(o.toString());
                    break;
                case "date_otdelGIBDD":
                    kotopravaRequisition.setDateGIBDD(o.toString());
                    break;
                case "time_otdelGIBDD":
                    kotopravaRequisition.setTimeGIBDD(o.toString());
                    break;
                case "serviceId":
                    kotopravaRequisition.setServiceId((Integer) o);
                    break;
            }
        });


        KotopravaRequisition save = kotopravaRepository.save(kotopravaRequisition);
        return save.getId();
    }

}
