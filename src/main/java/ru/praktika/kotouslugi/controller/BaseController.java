package ru.praktika.kotouslugi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.KotoError;
import ru.praktika.kotouslugi.model.enums.ErrorCode;
import ru.praktika.kotouslugi.model.response.BaseResponse;
import ru.praktika.kotouslugi.util.FunctionSE;

public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected <T> BaseResponse<T> wrapper(FunctionSE<T> f) {
        BaseResponse<T> response = new BaseResponse<>();

        try {
            return response.build(f.apply(null)).build(ErrorCode.OK);
        } catch (ServiceException e) {
            return response.build(KotoError.get(ErrorCode.INTERNAL_ERROR.getCode(), e.getMessage()));
        }
    }
}
