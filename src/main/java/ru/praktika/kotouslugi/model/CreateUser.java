package ru.praktika.kotouslugi.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "OWNERS_INFORMATION" )
public class CreateUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@PrimaryKeyJoinColumn(name = "id")
    //@Column(name = "NAME", columnDefinition = "VARCHAR(20)", nullable = false)
    //@Column(name = "SURNAME", columnDefinition = "VARCHAR(20)", nullable = false
    @Column(name="ID", updatable = false, nullable = false)
    private Long id;
    @Column(name = "NAME", columnDefinition = "VARCHAR(20)", nullable = false)
    private String NAME;
    @Column(name = "SURNAME", columnDefinition = "VARCHAR(20)", nullable = false)
    private String SURNAME;
    @Column(name = "MIDDLE_NAME", columnDefinition = "VARCHAR(50)", nullable = true)
    private String MIDDLE_NAME;
    @Column(name = "PHONE_NUMBER", columnDefinition = "VARCHAR(20)", nullable = true)
    private String PHONE_NUMBER;
    @Column(name = "EMAIL", columnDefinition = "VARCHAR(50)", nullable = true)
    private String EMAIL;

    //@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    //private List<CreateCat> createCats;
    public CreateUser() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String name) {
        this.NAME = name;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getMIDDLE_NAME() {
        return MIDDLE_NAME;
    }

    public void setMIDDLE_NAME(String MIDDLE_NAME) {
        this.MIDDLE_NAME = MIDDLE_NAME;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
}
