package ru.praktika.kotouslugi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.praktika.kotouslugi.model.Requisition;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.service.RequisitionService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/requisition")
public class RequisitionController extends BaseController {

    @Autowired
    private RequisitionService requisitionService;

    @RequestMapping(value = "listRequisition", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse<List<Requisition>> listRequisition() {
        return wrapper((s) -> requisitionService.listRequisition());
    }

    @RequestMapping(value = "createRequisition", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse<Integer> createRequisition(@RequestBody Map<String, Object> request) {
        return wrapper((s) -> requisitionService.createRequisition(request));
    }

    @RequestMapping(value = "updateRequisition", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse<Boolean> updateRequisition(@RequestBody Map<String, Object> request) {
        return wrapper((s) -> requisitionService.updateRequisition(request));
    }
}
