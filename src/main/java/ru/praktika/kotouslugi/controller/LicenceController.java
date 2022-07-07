package ru.praktika.kotouslugi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Licence;
import ru.praktika.kotouslugi.service.LicenceService;

import java.util.List;


@RestController
@RequestMapping("/licenceService")
public class LicenceController {

    @Autowired
    private LicenceService licenceService;

    @RequestMapping(value = "listLicence", method = RequestMethod.POST, produces = "application/json")
    public List<Licence> listLicence() {
        List<Licence> licences = licenceService.listLicence();
        return licences;
    }

    @RequestMapping(value = "addLicence", method = RequestMethod.POST, produces = "application/json")
    public Long addLicence(@RequestBody Licence licence) {
        return licenceService.addLicence(licence);
    }

    @RequestMapping(value = "getLicence", method = RequestMethod.GET, produces = "application/json")
    public Licence getLicence(@RequestParam Long id) {
        return licenceService.getLicence(id);
    }

    @RequestMapping(value = "deleteLicence", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteLicence(@RequestParam Long id) {
        licenceService.deleteLicence(id);
    }
}
