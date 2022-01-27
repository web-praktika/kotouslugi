package ru.praktika.kotouslugi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.Category;
import ru.praktika.kotouslugi.model.KotoServiceEntity;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.request.RequestId;
import ru.praktika.kotouslugi.service.KotoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(description = "Методы для работы с АПИ котоуслуг")
public class ProductServiceController extends BaseController {

    @Autowired
    private KotoService kotoService;

    @RequestMapping(value = "hello", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Поздороваться с сервисом",
            notes = "Используется для тестирования",
            response = BaseResponse.class,
            tags = {"Котоуслуги"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<String> hello() {
        return wrapper((s) -> "hello test!!");
    }

    @RequestMapping(value = "testException", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Поймать ошибку",
            notes = "Используется для тестирования",
            response = BaseResponse.class,
            tags = {"Котоуслуги"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<String> testException() {
        return wrapper((s) -> {
            throw new ServiceException("test exception!");
        });
    }

    @RequestMapping(value = "listService", method = RequestMethod.POST, produces = "application/json")
    @ApiOperation(value = "Список сервисов котоуслуг",
            notes = "Получение данных о сервисах",
            response = BaseResponse.class,
            tags = {"Котоуслуги"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    @ResponseBody
    public BaseResponse<List<KotoServiceEntity>> listService() {
        return wrapper((s) -> kotoService.listServices());
    }

    @RequestMapping(value = "getServiceById", method = RequestMethod.POST, produces = "application/json")
    @ApiOperation(value = "Список сервисов котоуслуг",
            notes = "Получение данных о сервисах",
            response = BaseResponse.class,
            tags = {"Котоуслуги"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    @ResponseBody
    public BaseResponse<KotoServiceEntity> getServiceById(
            @ApiParam(name = "requestId", value = "Идентификатор по которому запрашивается услуга", required = true)
            @RequestBody RequestId request) {
        return wrapper((s) -> kotoService.getServiceById(request));
    }

    @RequestMapping(value = "listCategories", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Список категорий",
            notes = "Получение данных о сервисах",
            response = BaseResponse.class,
            tags = {"Котоуслуги"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<Category>> listCategories() {
        return wrapper((s) -> kotoService.listCategories());
    }
}