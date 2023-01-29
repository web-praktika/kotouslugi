package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.TestEntity;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@Api("Тестовый контроллер")
public class TestController extends BaseController{

    @Autowired
    private TestService testService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение тестовых данных", tags = "Котоуслуги, Test")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveTestEntity(@ApiParam(name = "request", value = "тело запроса", required = true)
                              @RequestBody TestEntity testEntity){
        testService.saveTestEntity(testEntity);

    }

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение тестовых данных", tags = "Котоуслуги, Test")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<TestEntity>> getTestEntityList() {
        return wrapper(s -> testService.getEntityList());
    }
}