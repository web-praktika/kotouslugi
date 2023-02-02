package ru.praktika.kotouslugi.model;

import javax.persistence.*;

@Entity
@Table(name = "OWNERS_ADDRESS" )
public class UserAdress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", updatable = false, nullable = false)
    private Long id;
    @Column(name = "OWNER_ID", columnDefinition = "INTEGER", nullable = false)
    private Integer OWNER_ID ;
    @Column(name = "CITY ", columnDefinition = "VARCHAR(128)", nullable = false)
    private String CITY;
    @Column(name = "DISTRICT", columnDefinition = "VARCHAR(64)", nullable = true)
    private String DISTRICT;
    @Column(name = "BUILDING", columnDefinition = "VARCHAR(64)", nullable = false)
    private String BUILDING;
    @Column(name = "STREET ", columnDefinition = "VARCHAR(128)", nullable = true)
    private String STREET;


    public UserAdress() {

    }

    public Integer getOWNER_ID() {
        return OWNER_ID;
    }

    public void setOWNER_ID(Integer OWNER_ID) {
        this.OWNER_ID = OWNER_ID;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBUILDING() {
        return BUILDING;
    }

    public void setBUILDING(String BUILDING) {
        this.BUILDING = BUILDING;
    }

    public String getSTREET() {
        return STREET;
    }

    public void setSTREET(String STREET) {
        this.STREET = STREET;
    }
}
