package ru.praktika.kotouslugi.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="cat_passports")
public class CatPassport {

    @Id
    @GeneratedValue
    private Long id;
    private String parameter;
    private String value;

    public CatPassport() {

    }

    public CatPassport(String parameter, String value) {
        this.parameter = parameter;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
