package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.GetBreed;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.GetBreedService;

import java.util.List;

@RestController
@RequestMapping("/api/breed")
@Api("Получение списка пород")
public class GetBreedController extends BaseController {

    @Autowired
    private GetBreedService getBreedService;

    @GetMapping(value = "get", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<GetBreed>> getBreedsList() {
        return wrapper(s -> getBreedService.getBreedsList());
    }
}
