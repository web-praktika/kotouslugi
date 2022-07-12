package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.LicenceRequisition;
import ru.praktika.kotouslugi.service.LicenceRequisitionService;

import java.util.List;

@RestController
@RequestMapping("/api/licenceRequisition")
@Api(description = "Заявки на лицензию")
public class LicenceRequisitionController extends BaseController {

    @Autowired
    private LicenceRequisitionService licenceRequisitionService;

    @RequestMapping(value = "listLicenceRequisition", method = RequestMethod.POST, produces = "application/json")
    public List<LicenceRequisition> listLicenceRequisition() {
        return licenceRequisitionService.listLicenceRequisition();
    }

    @RequestMapping(value = "createLicenceRequisition", method = RequestMethod.POST, produces = "application/json")
    public Long createLicenceRequisition(@RequestBody LicenceRequisition licenceRequisition) {
        return licenceRequisitionService.createLicenceRequisition(licenceRequisition);
    }

    @RequestMapping(value = "updateLicenceRequisition", method = RequestMethod.POST, produces = "application/json")
    public Boolean updateLicenceRequisition(@RequestBody LicenceRequisition licenceRequisition) throws ServiceException {
        return licenceRequisitionService.updateLicenceRequisition(licenceRequisition);
    }
}