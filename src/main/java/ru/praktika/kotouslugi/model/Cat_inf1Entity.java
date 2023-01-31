package ru.praktika.kotouslugi.model;


import javax.persistence.*;

@Entity
@Table(name="CAT_INF1")
public class Cat_inf1Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CAT_ID", nullable = false)
    private Integer CAT_ID;
    private String NAME;
    private String SEX;
    private String BREED;
    private String CAT_COLOR;

    public Cat_inf1Entity() {

    }

    public Integer getId() {
        return CAT_ID;
    }
    public void setId(Integer CAT_ID) {
        this.CAT_ID = CAT_ID;
    }

    public String getNAME() {
        return NAME;
    }
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSEX() {
        return SEX;
    }
    public void setSEX(String SEX) { this.SEX = SEX; }

    public String getBREED() {
        return BREED;
    }
    public void setBREED(String BREED) {
        this.BREED = BREED;
    }

    public String getCAT_COLOR() {
        return CAT_COLOR;
    }
    public void setCAT_COLOR(String CAT_COLOR) {
        this.CAT_COLOR = CAT_COLOR;
    }

}
