package ru.praktika.kotouslugi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Cat;
import ru.praktika.kotouslugi.service.CatService;

import java.util.List;

@RestController
@RequestMapping("/сatService")
public class CatController {
    @Autowired
    private CatService catService;

    @RequestMapping(value = "listCat", method = RequestMethod.POST, produces = "application/json")
    public List<Cat> listCat(){
        List<Cat> cats =  catService.listCat();
        return cats;
    }

    @RequestMapping(value = "addCat", method = RequestMethod.POST, produces = "application/json")
    public Long addCat(@RequestBody Cat cat) {
        return catService.addCat(cat);
    }

    @RequestMapping(value = "getCat", method = RequestMethod.GET, produces = "application/json")
    public Cat getCat(@RequestParam Long id){
        return catService.getCat(id);
    }

    @RequestMapping(value = "deleteCat", method = RequestMethod.GET, produces = "application/json")
    public void deleteCat(@RequestParam Long id){
        catService.deleteCat(id);
    }
}
