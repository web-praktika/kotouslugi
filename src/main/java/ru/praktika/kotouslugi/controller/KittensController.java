package ru.praktika.kotouslugi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Kittens;
import ru.praktika.kotouslugi.service.KittensService;

import java.util.List;


//ВСЕ ПЛОХО ЭТО УДАЛИТЬ!!

@RestController
@RequestMapping("/kittensService")
public class KittensController {

    @Autowired
    private KittensService kittensService;

    @RequestMapping(value = "listCat", method = RequestMethod.POST, produces = "application/json")
    public List<Kittens> listCat() {
        List<Kittens> cats = kittensService.listCat();
        return cats;
    }

    @RequestMapping(value = "addKitten", method = RequestMethod.POST, produces = "application/json")
    public Long addKitten(@RequestBody Kittens cat) {
        return kittensService.addKitten(cat);
    }

    @RequestMapping(value = "getCat", method = RequestMethod.GET, produces = "application/json")
    public Kittens getCat(@RequestParam Long id) {
        return kittensService.getCat(id);
    }

}
