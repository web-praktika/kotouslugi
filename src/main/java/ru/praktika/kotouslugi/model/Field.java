package ru.praktika.kotouslugi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "field")
public class Field implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String value;

    public Field() {
    }

    public Field(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

//    public Requisition getRequisition() {
//        return requisition;
//    }
//
//    public void setRequisition(Requisition requisition) {
//        this.requisition = requisition;
//    }
}
