package ru.praktika.kotouslugi.model.response;

import ru.praktika.kotouslugi.model.KotoError;
import ru.praktika.kotouslugi.model.enums.ErrorCode;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {
    protected KotoError error;
    protected T content;

    public KotoError getError() {
        return error;
    }

    public void setError(KotoError error) {
        this.error = error;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BaseResponse<T> build(ErrorCode errorCode) {
        error = KotoError.get(errorCode);
        return this;
    }

    public BaseResponse<T> build(ErrorCode errorCode, String message) {
        error = KotoError.get(errorCode, message);
        return this;
    }

    public BaseResponse<T> build(KotoError src) {
        error = src;
        return this;
    }

    public BaseResponse<T> build(T content) {
        this.content = content;
        return this;
    }
}
