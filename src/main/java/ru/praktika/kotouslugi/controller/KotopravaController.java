package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.KotopravaRequisition;
import ru.praktika.kotouslugi.model.Requisition;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.KotopravaService;
import ru.praktika.kotouslugi.service.RequisitionService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/kotopravaRequisition")
@Api(description = "Для работы с услугой Котоправа")
public class KotopravaController extends BaseController{

    @Autowired
    private KotopravaService kotopravaService;

    @RequestMapping(value = "listPravaRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Список реквизитов заявления",
            notes = "Список реквизитов заявления",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления","Котоправа"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<KotopravaRequisition>> listPravaRequisition() {
        return wrapper((s) -> kotopravaService.listPravaRequisition());
    }

    @RequestMapping(value = "createPravaRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Создать заявление для котоправ",
            notes = "Создать заявление для котоправ",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления","Котоправа"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<Long> createPravaRequisition(@ApiParam(name = "request", value = "Тело запроса", required = true)
                                                   @RequestBody Map<String, Object> request) {
        return wrapper((s) -> kotopravaService.createPravaRequisition(request));
    }
}
