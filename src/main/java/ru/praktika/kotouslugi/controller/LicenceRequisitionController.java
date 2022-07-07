package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.praktika.kotouslugi.model.Requisition;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.RequisitionService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/requisition")
@Api(description = "Методы для работы с заявлениями котоуслуг")
public class RequisitionController extends BaseController {

    @Autowired
    private RequisitionService requisitionService;

    @RequestMapping(value = "listRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Список реквизитов заявления",
            notes = "Список реквизитов заявления",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<Requisition>> listRequisition() {
        return wrapper((s) -> requisitionService.listRequisition());
    }

    @RequestMapping(value = "createRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Создать заявление",
            notes = "Создать заявление",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<Integer> createRequisition(@ApiParam(name = "request", value = "Тело запроса", required = true)
                                                   @RequestBody Map<String, Object> request) {
        return wrapper((s) -> requisitionService.createRequisition(request));
    }

    @RequestMapping(value = "updateRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Обновить заявление",
            notes = "Обновить заявление",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<Boolean> updateRequisition(@ApiParam(name = "request", value = "Тело запроса", required = true)
                                                   @RequestBody Map<String, Object> request) {
        return wrapper((s) -> requisitionService.updateRequisition(request));
    }
}