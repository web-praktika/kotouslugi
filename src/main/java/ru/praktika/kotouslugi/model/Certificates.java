package ru.praktika.kotouslugi.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="certificates")
public class Certificates {
    @Id
    @GeneratedValue
    private Integer id;
    private String educationPlace;
    private String eduCertificateNumber;
    private String eduCertificateDate;
    private String medCertificateNumber;
    private String medCertificateDate;

    public Certificates() { }

    public Certificates(String educationPlace, String eduCertificateDate, String eduCertificateNumber,
                        String medCertificateNumber, String medCertificateDate) {
        this.educationPlace = educationPlace;
        this.eduCertificateDate = eduCertificateDate;
        this.eduCertificateNumber = eduCertificateNumber;
        this.medCertificateNumber = medCertificateNumber;
        this.medCertificateDate = medCertificateDate;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEducationPlace() {
        return educationPlace;
    }

    public void setEducationPlace(String educationPlace) {
        this.educationPlace = educationPlace;
    }

    public String getEduCertificateNumber() {
        return eduCertificateNumber;
    }

    public void setEduCertificateNumber(String eduCertificateNumber) {
        this.eduCertificateNumber = eduCertificateNumber;
    }

    public String getEduCertificateDate() {
        return eduCertificateDate;
    }

    public void setEduCertificateDate(String eduCertificateDate) {
        this.eduCertificateDate = eduCertificateDate;
    }

    public String getMedCertificateNumber() {
        return medCertificateNumber;
    }

    public void setMedCertificateNumber(String medCertificateNumber) {
        this.medCertificateNumber = medCertificateNumber;
    }

    public String getMedCertificateDate() {
        return medCertificateDate;
    }

    public void setMedCertificateDate(String medCertificateDate) {
        this.medCertificateDate = medCertificateDate;
    }
}
