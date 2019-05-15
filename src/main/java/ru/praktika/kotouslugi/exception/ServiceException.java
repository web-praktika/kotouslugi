package ru.praktika.kotouslugi.exception;

public class ServiceException extends Exception {
    private Object data;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Object data) {
        super(message);
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}

