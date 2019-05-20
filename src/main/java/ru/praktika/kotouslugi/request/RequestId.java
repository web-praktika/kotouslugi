package ru.praktika.kotouslugi.request;

import java.io.Serializable;

public class RequestId implements Serializable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
