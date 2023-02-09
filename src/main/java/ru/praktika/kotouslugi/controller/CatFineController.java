package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.CatFines;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.CatFinesService;

import java.util.List;

@RestController
@RequestMapping("/api/catfines")
@Api("Контроллер штрафов")
public class CatFineController extends BaseController {

    @Autowired
    private CatFinesService catFinesService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveFine(@ApiParam(name = "request", value = "Тело запроса", required = true)
                               @RequestBody CatFines catFines) {
        catFinesService.saveCatFine(catFines);
    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<CatFines>> getCatFine() {
        return wrapper(s -> catFinesService.getCatFine());
    }

    @GetMapping(value = "get/{id}", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Получения пользователя по ID"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<CatFines> getCreateUser(@ApiParam(name = "request", value = "ID запроса", required = true)
                                                 @PathVariable Integer id) {
        return wrapper(s -> catFinesService.getCatFineByID(id));
    }

}
