package ru.praktika.kotouslugi.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="certificates")
public class Certificates {
    @Id
    private Integer catId;
    private String nameEducationPlace;
    private Long educationCertificateNumber;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date educationCertificateDate;
    private Long medCertificateNumber;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date medCertificateDate;


    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getNameEducationPlace() {
        return nameEducationPlace;
    }

    public void setNameEducationPlace(String nameEducationPlace) {
        this.nameEducationPlace = nameEducationPlace;
    }

    public Long getEducationCertificateNumber() {
        return educationCertificateNumber;
    }

    public void setEducationCertificateNumber(Long educationCertificateNumber) {
        this.educationCertificateNumber = educationCertificateNumber;
    }

    public Date getEducationCertificateDate() {
        return educationCertificateDate;
    }

    public void setEducationCertificateDate(Date educationCertificateDate) {
        this.educationCertificateDate = educationCertificateDate;
    }

    public Long getMedCertificateNumber() {
        return medCertificateNumber;
    }

    public void setMedCertificateNumber(Long medCertificateNumber) {
        this.medCertificateNumber = medCertificateNumber;
    }

    public Date getMedCertificateDate() {
        return medCertificateDate;
    }

    public void setMedCertificateDate(Date medCertificateDate) {
        this.medCertificateDate = medCertificateDate;
    }
}
