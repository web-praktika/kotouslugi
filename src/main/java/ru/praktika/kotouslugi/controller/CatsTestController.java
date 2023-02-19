package ru.praktika.kotouslugi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Cat;
import ru.praktika.kotouslugi.model.CatsTest;
import ru.praktika.kotouslugi.model.Kittens;
import ru.praktika.kotouslugi.service.CatsTestService;

import java.util.Map;

@RestController
@RequestMapping("/api/cats-test")
public class CatsTestController extends BaseController{

    @Autowired
    CatsTestService catsTestService;

    @RequestMapping(value = "createCatTest", method = RequestMethod.POST, produces = "application/json")
    public Integer createCatTest(@RequestBody Map<String, Object> request) { return catsTestService.createCatTest(request); }

    @RequestMapping(value = "addCatTest", method = RequestMethod.POST, produces = "application/json")
    public Integer addCatTest(@RequestBody Kittens catsTest) {
        return catsTestService.addCatTest(catsTest);
    }

    @RequestMapping(value = "getCatTest", method = RequestMethod.GET, produces = "application/json")
    public Kittens getCatTest(@RequestParam Integer id) {
        return catsTestService.getCatTest(id);
    }
}
