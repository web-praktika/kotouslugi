package ru.praktika.kotouslugi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kittens")
public class Kittens {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;

    public Kittens() {

    }

    public Kittens(String name, String value) {
        this.name = name;
        this.value = value;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
