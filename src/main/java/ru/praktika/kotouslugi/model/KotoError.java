package ru.praktika.kotouslugi.model;

import ru.praktika.kotouslugi.model.enums.ErrorCode;

import java.io.Serializable;

public class KotoError implements Serializable {
    public static KotoError get() {
        return new KotoError();
    }

    public static KotoError get(ErrorCode errorCode) {
        return get(errorCode.getCode(), errorCode.getMessage());
    }

    public static KotoError get(ErrorCode errorCode, String message) {
        return get(errorCode.getCode(), message);
    }

    public static KotoError get(Long code, String message) {
        return new KotoError(code, message);
    }

    Long code;
    String message;

    public KotoError() {
        code = ErrorCode.OK.getCode();
    }

    public KotoError(Long code, String message) {
        this.code = code;
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
