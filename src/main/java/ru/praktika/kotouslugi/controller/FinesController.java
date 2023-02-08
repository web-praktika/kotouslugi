package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.Fines;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.FinesService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/fines")
@Api("Получение списка штрафов")
public class FinesController extends BaseController  {

    @Autowired
    private FinesService finesService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveFine(@ApiParam(name = "request", value = "Тело запроса", required = true)
                               @RequestBody Fines fines) {
        finesService.saveFine(fines);
    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<Fines>> getFinesList() {
        return wrapper(s -> finesService.getFines());
    }

    @GetMapping(value = "get/{id}", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Получения пользователя по ID"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<Fines> getFines(@ApiParam(name = "request", value = "ID запроса", required = true)
                                                 @PathVariable Integer id) {
        return wrapper(s -> finesService.getFinesByID(id));
    }

    @PostMapping(value = "delete", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Обновление данных пользователя", tags = {"Котоуслуги", "Обновление пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void deleteFine(@ApiParam(name = "request", value = "Тело запроса", required = true)
                               @PathVariable Integer id) {
        finesService.deleteFine(id);
    }
}
