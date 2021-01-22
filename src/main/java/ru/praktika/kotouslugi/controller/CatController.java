package ru.praktika.kotouslugi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.praktika.kotouslugi.model.Cat;
import ru.praktika.kotouslugi.service.CatService;

import java.util.List;

@RestController
@RequestMapping("/api/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @RequestMapping(value = "getCat", method = RequestMethod.GET)
    public Cat getCat(Long id) {
        return catService.getCat(id);
    }

    @RequestMapping(value = "setCat", method = RequestMethod.POST, produces = "application/json")
    public Long setCat(@RequestBody Cat cat) {
        return catService.setCat(cat);
    }

    @RequestMapping(value = "deleteCat", method = RequestMethod.DELETE, produces = "application/json")
    public Boolean deleteCat(@RequestBody Cat cat) {
        return catService.deleteCat(cat);
    }

    @RequestMapping(value = "listCat", method = RequestMethod.GET)
    public List<Cat> listCat() {
        return catService.listCat();
    }
}
