package ru.praktika.kotouslugi.model;

import javax.persistence.*;

@Entity
@Table(name = "BREEDS" )
public class GetBreed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn(name = "id")
    private Integer id;
    private String breed;

    public GetBreed() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return breed;
    }

    public void setText(String text) {
        this.breed = text;
    }
}
