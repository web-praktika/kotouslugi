package ru.praktika.kotouslugi.model.enums;

public enum ErrorCode {
    OK(0L, null),
    INTERNAL_ERROR(1L, "Во время выполнения запроса произошла ошибка");

    private Long code;
    private String message;

    ErrorCode(Long code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}
