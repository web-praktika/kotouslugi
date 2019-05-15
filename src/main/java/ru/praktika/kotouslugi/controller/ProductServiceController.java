package ru.praktika.kotouslugi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.response.BaseResponse;

@RestController
@RequestMapping("/api")
public class ProductServiceController extends BaseController {

    @RequestMapping(value = "hello", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse<String> copyRequisit() {
        return wrapper((s) -> "hello test!!");
    }

    @RequestMapping(value = "testException", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse<String> testException() {
        return wrapper((s) -> {
            throw new ServiceException("test exception!");
        });
    }
}
