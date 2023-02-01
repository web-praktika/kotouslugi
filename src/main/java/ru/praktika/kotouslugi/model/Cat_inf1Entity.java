package ru.praktika.kotouslugi.model;


import javax.persistence.*;

@Entity
@Table(name="CAT_INF1")
public class Cat_inf1Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer ID;
    private String NAME;
    private String SEX;
    private String BREED;
    private String CAT_COLOR;
    private String PHOTO;
    private String REASON_FOR_REPLACEMENT;
    private String MARITAL_STATUS;
    private String FATHER;
    private String MOTHER;


    public Cat_inf1Entity() {

    }

    public Integer getId() {
        return ID;
    }
    public void setId(Integer ID) {
        this.ID = ID;
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

    public String getCAT_COLOR() { return CAT_COLOR; }
    public void setCAT_COLOR(String CAT_COLOR) { this.CAT_COLOR = CAT_COLOR; }

    public String getPHOTO() { return PHOTO; }
    public void setPHOTO(String PHOTO) { this.PHOTO = PHOTO; }

    public String getREASON_FOR_REPLACEMENT() {
        return REASON_FOR_REPLACEMENT;
    }
    public void setREASON_FOR_REPLACEMENT(String REASON_FOR_REPLACEMENT) { this.REASON_FOR_REPLACEMENT = REASON_FOR_REPLACEMENT; }

    public String getMARITAL_STATUS() {
        return MARITAL_STATUS;
    }
    public void setMARITAL_STATUS(String MARITAL_STATUS) {
        this.MARITAL_STATUS = MARITAL_STATUS;
    }

    public String getFATHER() {
        return FATHER;
    }
    public void setFATHER(String FATHER) {
        this.FATHER = FATHER;
    }

    public String getMOTHER() {
        return MOTHER;
    }
    public void setMOTHER(String MOTHER) {
        this.MOTHER = MOTHER;
    }

}
