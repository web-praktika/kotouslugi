package ru.praktika.kotouslugi.controller;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.GetCity;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.GetCityService;

import java.util.List;

@RestController
@RequestMapping("/api/getcity")
@Api("Получение списка городов")
public class GetCityController extends BaseController {

    @Autowired
    private GetCityService getCityService;

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<GetCity>> getCitiesList() {
        return wrapper(s -> getCityService.getCitiesList());
    }
}
