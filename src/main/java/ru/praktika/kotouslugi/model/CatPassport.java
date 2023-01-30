package ru.praktika.kotouslugi.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="cat_passports")
public class CatPassport {

    @Id
    private Integer catId;
    private Long passportId;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date datePassport;
    private Integer numberDepartment;
    private String registration;

    public CatPassport() {

    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }


    public Integer getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(Integer numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getDatePassport() {
        return datePassport;
    }

    public void setDatePassport(Date datePassport) {
        this.datePassport = datePassport;
    }
}
