package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.praktika.kotouslugi.model.TestEntity;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.TestService;


import java.util.List;

@RestController
@RequestMapping("/api/test")
@Api("Тестовый контроллер")
public class TestController extends BaseController {

    @Autowired
    private TestService testService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение текстовых данных", tags = {"Котоуслуги", "test"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })

    public void saveTestEntity(@ApiParam(name = "request", value = "Тело запроса", required = true)
                               @RequestBody TestEntity testEntity) {
        testService.saveTestEntity(testEntity);
    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение текстовых данных", tags = {"Котоуслуги", "test"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<TestEntity>> getTestEntityList() {
        return wrapper(s -> testService.getEntityList());
    }

}
