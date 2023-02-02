package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.CreateUser;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.CreateUserService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/createuser")
@Api("Контроллер создания пользователя")
public class CreateUserController extends BaseController {

    @Autowired
    private CreateUserService createUserService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveCreateUser(@ApiParam(name = "request", value = "Тело запроса", required = true)
                                   @RequestBody CreateUser createUser) {
        createUserService.saveCreateUser(createUser);
    }

    @PostMapping(value = "save2", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveUs(@ApiParam(name = "request", value = "Тело запроса", required = true)
                           @RequestBody Map<String, Object> request) {
        createUserService.saveUser(request);
    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<CreateUser>> getCreateUserList() {
        return wrapper(s -> createUserService.getCreateUserList());
    }

    @GetMapping(value = "get/{id}", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<CreateUser> getCreateUserID(@ApiParam(name = "request", value = "ID запроса", required = true)
                                                            @PathVariable Integer id) {
        return wrapper(s -> createUserService.getCreateUser(id));
    }

}
