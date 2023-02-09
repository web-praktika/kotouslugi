package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.CreateUser;
import ru.praktika.kotouslugi.model.UserAdress;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.UserAddressService;

import java.util.List;
@RestController
@RequestMapping("/api/address")
@Api("Получение списка ")
public class UserAddressController extends BaseController {
        @Autowired
        private UserAddressService userAddressService;

    @PostMapping(value = "save", produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Сохранение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public void saveCreateUser(@ApiParam(name = "request", value = "Тело запроса", required = true)
                               @RequestBody UserAdress userAdress) {
        userAddressService.saveUserAddress(userAdress);
    }

        @GetMapping(value = "get", produces = "application/json")
        @ResponseBody
        @ApiOperation(value = "Получение данных пользователя", tags = {"Котоуслуги", "Создание пользователя"})
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
                @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
                @ApiResponse(code = 500, message = "Внутренняя ошибка") })
        public BaseResponse<List<UserAdress>> getAddressList() {
            return wrapper(s -> userAddressService.getAddressList());
        }
}
