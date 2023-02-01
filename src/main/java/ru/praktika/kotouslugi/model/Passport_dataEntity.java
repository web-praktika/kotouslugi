package ru.praktika.kotouslugi.model;


import javax.persistence.*;

@Entity
@Table(name="PASSPORT_DATA")
public class Passport_dataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer ID;
    private Integer PASSPORT_ID;
    private String PASSPORT_SERIES;
    private String DATE_OF_ISSUE;
    private String ISSUED_BY;
    private String COUNTRY_OF_BIRTH;

    public Passport_dataEntity() {

    }

    public Integer getID() {
        return ID;
    }
    public void setID(Integer PASSPORT_ID) {
        this.ID = PASSPORT_ID;
    }

    public Integer getPASSPORT_ID() {
        return PASSPORT_ID;
    }
    public void setPASSPORT_ID(Integer PASSPORT_ID) {
        this.PASSPORT_ID = PASSPORT_ID;
    }

    public String getPASSPORT_SERIES() { return PASSPORT_SERIES; }
    public void setPASSPORT_SERIES(String PASSPORT_SERIES) { this.PASSPORT_SERIES = PASSPORT_SERIES; }

    public String getDATE_OF_ISSUE() { return DATE_OF_ISSUE; }
    public void setDATE_OF_ISSUE(String DATE_OF_ISSUE) { this.DATE_OF_ISSUE = DATE_OF_ISSUE; }

    public String getISSUED_BY() { return ISSUED_BY; }
    public void setISSUED_BY(String ISSUED_BY) { this.ISSUED_BY = ISSUED_BY; }

    public String getCOUNTRY_OF_BIRTH() { return COUNTRY_OF_BIRTH; }
    public void setCOUNTRY_OF_BIRTH(String COUNTRY_OF_BIRTH) { this.COUNTRY_OF_BIRTH = COUNTRY_OF_BIRTH; }

}
