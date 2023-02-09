package ru.praktika.kotouslugi.model;

import javax.persistence.*;

@Entity
@Table(name = "CITIES" )
public class GetCity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn(name = "id")
    private Integer id;
    private String city;

    public GetCity() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
