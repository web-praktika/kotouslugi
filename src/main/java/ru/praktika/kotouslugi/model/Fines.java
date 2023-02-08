package ru.praktika.kotouslugi.model;

import javax.persistence.*;

@Entity
@Table(name = "FINES" )
public class Fines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cat_Id;

    private String title;
    private String desc;
    private Double cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatId() {
        return cat_Id;
    }

    public void setCatId(Integer catId) {
        this.cat_Id = catId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
