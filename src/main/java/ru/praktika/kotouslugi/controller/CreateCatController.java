package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.CreateCat;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.CreateCatService;
import ru.praktika.kotouslugi.service.CreateCatService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/createcat")
@Api("Контроллер создания кота")
public class CreateCatController extends BaseController {

    @Autowired
    private CreateCatService createCatService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveCreateUser(@ApiParam(name = "request", value = "Тело запроса", required = true)
                               @RequestBody CreateCat createCat) {
        createCatService.saveCreateCat(createCat);
    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<CreateCat>> getCreateUserList() {
        return wrapper(s -> createCatService.getCreateCatList());
    }

    @GetMapping(value = "get/{id}", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Получения пользователя по ID"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<CreateCat> getCreateUser(@ApiParam(name = "request", value = "ID запроса", required = true)
                                                  @PathVariable Integer id) {
        return wrapper(s -> createCatService.getCreateCat(id));
    }

    @PostMapping(value = "update", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Обновление данных пользователя", tags = {"Котоуслуги", "Обновление пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveCreateUser(@ApiParam(name = "request", value = "Тело запроса", required = true)
                               @RequestBody Map<String, Object> createCat) {
        createCatService.updateCreateCat(createCat);
    }
}
