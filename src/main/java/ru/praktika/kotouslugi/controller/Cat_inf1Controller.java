package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Cat_inf1Entity;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.Cat_inf1Service;

import java.util.List;

@RestController
@RequestMapping("/api/create_passport/s1")
@Api("Тестовый контроллер")
public class Cat_inf1Controller extends BaseController{

    @Autowired
    private Cat_inf1Service catinf1Service;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение тестовых данных", tags = "Котоуслуги, Test")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveTestEntity(@ApiParam(name = "request", value = "тело запроса", required = true)
                              @RequestBody Cat_inf1Entity catinf1Entity){
        catinf1Service.saveCat_inf1Entity(catinf1Entity);

    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение тестовых данных", tags = "Котоуслуги, Test")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<Cat_inf1Entity>> getTestEntityList() {
        return wrapper(s -> catinf1Service.getEntityList());
    }
}