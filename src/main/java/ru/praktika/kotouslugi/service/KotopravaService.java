package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.KotopravaRepository;
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
        KotopravaRequisition kotopravaRequisition = new KotopravaRequisition("Заявление",
                RequisitionStatus.DRAFT, " ", " ", " ");
        request.forEach((s, o) -> {
            switch (s) {
                case "nameRequisition":
                    kotopravaRequisition.setNameRequisition(o.toString());
                    break;
                case "status":
                    RequisitionStatus status = RequisitionStatus.valueOf(o.toString().toUpperCase());
                    kotopravaRequisition.setStatus(status);
                    break;
                case "kittens":
                    Kittens kittens = new Kittens();
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        switch (s1) {
                            case "name":
                                kittens.setName(o1.toString());
                                break;
                            case "breed":
                                kittens.setBreed(o1.toString());
                                break;
                            case "sex":
                                kittens.setSex(o1.toString());
                                break;
                            case "age":
                                kittens.setAge(o1.toString());
                                break;
                        }
                    });
                    kotopravaRequisition.setKittens(kittens);
                    break;
                case "passports":
                    CatPassport passport = new CatPassport();
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        switch (s1) {
                            case "passportId":
                                passport.setPassportId(o1.toString());
                                break;
                            case "passportDate":
                                passport.setPassportDate(o1.toString());
                                break;
                            case "numDepartment":
                                passport.setNumDepartment(o1.toString());
                                break;
                            case "registration":
                                passport.setRegistration(o1.toString());
                                break;
                        }
                    });
                    kotopravaRequisition.setPassports(passport);
                    break;
                case "certificates":
                    Certificates certificates = new Certificates();
                    ((Map<String, Object>) o).forEach((s1, o1) -> {
                        switch (s1) {
                            case "educationPlace":
                                certificates.setEducationPlace(o1.toString());
                                break;
                            case "eduCertificateNumber":
                                certificates.setEduCertificateNumber(o1.toString());
                                break;
                            case "eduCertificateDate":
                                certificates.setEduCertificateDate(o1.toString());
                                break;
                            case "medCertificateNumber":
                                certificates.setMedCertificateNumber(o1.toString());
                                break;
                            case "medCertificateDate":
                                certificates.setMedCertificateDate(o1.toString());
                                break;
                        }
                    });
                    kotopravaRequisition.setCertificates(certificates);
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
            }
        });

        KotopravaRequisition save = kotopravaRepository.save(kotopravaRequisition);
        return save.getId();
    }

}
