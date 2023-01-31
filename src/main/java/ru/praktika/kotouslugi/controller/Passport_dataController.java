package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Passport_dataEntity;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.Passport_dataService;

import java.util.List;

@RestController
@RequestMapping("/api/create_passport/s3")
@Api("PASSPORT_DATA контроллер")
public class Passport_dataController extends BaseController{

    @Autowired
    private Passport_dataService Passport_dataService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение PASSPORT_DATA данных", tags = "Котоуслуги, PASSPORT_DATA")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveTestEntity(@ApiParam(name = "request", value = "тело запроса", required = true)
                               @RequestBody Passport_dataEntity Passport_dataEntity){
        Passport_dataService.savePassport_dataEntity(Passport_dataEntity);

    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение PASSPORT_DATA данных", tags = "Котоуслуги, PASSPORT_DATA")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<Passport_dataEntity>> getTestEntityList() {
        return wrapper(s -> Passport_dataService.getEntityList());
    }
}