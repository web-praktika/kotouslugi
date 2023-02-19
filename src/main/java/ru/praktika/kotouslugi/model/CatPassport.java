package ru.praktika.kotouslugi.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="cat_passports")
public class CatPassport {

    @Id
    @GeneratedValue
    private Integer id;
    private String passportId;
    private String passportDate;
    private String numDepartment;
    private String registration;

    public CatPassport() {

    }

    public CatPassport(String passportId, String passportDate,
                       String numDepartment, String registration) {
        this.passportId = passportId;
        this.passportDate = passportDate;
        this.numDepartment = numDepartment;
        this.registration = registration;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(String passportDate) {
        this.passportDate = passportDate;
    }

    public String getNumDepartment() {
        return numDepartment;
    }

    public void setNumDepartment(String numDepartment) {
        this.numDepartment = numDepartment;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
