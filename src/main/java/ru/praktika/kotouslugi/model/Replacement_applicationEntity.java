package ru.praktika.kotouslugi.model;


import javax.persistence.*;

@Entity
@Table(name="REPLACEMENT_APPLICATION")
public class Replacement_applicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "APPLICATION_ID", nullable = false)
    private Integer APPLICATION_ID;
    private Integer CAT_ID;
    private String REASON_FOR_REPLACEMENT;
    private String MARITAL_STATUS;
    private String FATHER;
    private String MOTHER;
    private String SUBDIVISION;

    public Replacement_applicationEntity() {

    }

    public Integer getId() {
        return APPLICATION_ID;
    }
    public void setId(Integer APPLICATION_ID) {
        this.APPLICATION_ID = APPLICATION_ID;
    }

    public Integer getCAT_ID() {
        return CAT_ID;
    }
    public void setCAT_ID(Integer CAT_ID) {
        this.CAT_ID = CAT_ID;
    }

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

    public String getSUBDIVISION() {
        return SUBDIVISION;
    }
    public void setSUBDIVISION(String SUBDIVISION) {
        this.SUBDIVISION = SUBDIVISION;
    }

}
