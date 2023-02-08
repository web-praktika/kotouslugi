package ru.praktika.kotouslugi.model;

import javax.persistence.*;

@Entity
@Table(name = "CATS_INFORMATION" )
public class CreateCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", updatable = false, nullable = false)
    private Integer id;
    @Column(name = "NAME", columnDefinition = "VARCHAR(20)", nullable = false)
    private String NAME;
    @Column(name = "OWNER_ID", columnDefinition = "INTEGER", nullable = false)
    private Integer OWNER_ID ;
    @Column(name = "SEX ", columnDefinition = "VARCHAR(20)", nullable = false)
    private String SEX ;
    @Column(name = "BREED ", columnDefinition = "VARCHAR(50) DEFAULT 'Отсутствует'", nullable = false)
    private String BREED ;
    @Column(name = "AGE", columnDefinition = "INTEGER DEFAULT 0", nullable = false)
    private Integer AGE ;
    @Column(name = "WEIGHT", columnDefinition = "DOUBLE DEFAULT 0", nullable = false)
    private Double WEIGHT ;
    @Column(name = "VACCINATION_CERTIFICATE ", columnDefinition = "VARCHAR(50)", nullable = true)
    private String VACCINATION_CERTIFICATE ;


    public CreateCat() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String name) {
        this.NAME = name;
    }

    public String getSEX() {
        return SEX ;
    }

    public void setSEX(String SEX ) {
        this.SEX  = SEX ;
    }

    public String getBREED() {
        return BREED;
    }

    public void setBREED(String BREED) {
        this.BREED = BREED;
    }

    public String getVACCINATION_CERTIFICATE () {
        return VACCINATION_CERTIFICATE ;
    }

    public void setVACCINATION_CERTIFICATE (String VACCINATION_CERTIFICATE ) {
        this.VACCINATION_CERTIFICATE  = VACCINATION_CERTIFICATE ;
    }

    public Integer getAGE() {
        return AGE;
    }

    public void setAGE(Integer AGE) {
        this.AGE = AGE;
    }

    public Integer getOWNER_ID() {
        return OWNER_ID;
    }

    public void setOWNER_ID(Integer OWNER_ID) {
        this.OWNER_ID = OWNER_ID;
    }

    public Double getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(Double WEIGHT) {
        this.WEIGHT = WEIGHT;
    }
}
