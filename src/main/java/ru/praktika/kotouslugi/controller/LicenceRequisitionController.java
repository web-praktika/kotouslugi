package ru.praktika.kotouslugi.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.praktika.kotouslugi.model.LicenceRequisition;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.LicenceRequisitionService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/licence_requisition")
@Api(description = "Методы для работы с заявлениями котоуслуг")
public class LicenceRequisitionController extends BaseController {

    @Autowired
    private LicenceRequisitionService licenceRequisitionService;

    @RequestMapping(value = "listLicenceRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Список реквизитов заявления",
            notes = "Список реквизитов заявления",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<List<LicenceRequisition>> listLicenceRequisition() {
        return wrapper((s) -> licenceRequisitionService.listLicenceRequisition());
    }

    @RequestMapping(value = "createLicenceRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Создать заявление",
            notes = "Создать заявление",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<Integer> createLicenceRequisition(@ApiParam(name = "request", value = "Тело запроса", required = true)
                                                   @RequestBody Map<String, Object> request) {
        return wrapper((s) -> licenceRequisitionService.createLicenceRequisition(request));
    }

    @RequestMapping(value = "updateLicenceRequisition", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Обновить заявление",
            notes = "Обновить заявление",
            response = BaseResponse.class,
            tags = {"Котоуслуги","Заявления"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = BaseResponse.class),
            @ApiResponse(code = 401, message = "Не авторизованный пользователь"),
            @ApiResponse(code = 500, message = "Внутренняя ошибка") })
    public BaseResponse<Boolean> updateLicenceRequisition(@ApiParam(name = "request", value = "Тело запроса", required = true)
                                                   @RequestBody Map<String, Object> request) {
        return wrapper((s) -> licenceRequisitionService.updateLicenceRequisition(request));
    }
}