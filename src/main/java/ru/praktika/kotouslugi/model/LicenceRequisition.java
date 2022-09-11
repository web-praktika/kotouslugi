package ru.praktika.kotouslugi.model;

import ru.praktika.kotouslugi.model.enums.LicenceRequisitionStatus;

import javax.persistence.*;

@Entity
@Table(name = "licenceRequisition")
public class LicenceRequisition {
    @Id
    @GeneratedValue
    private Long licenceN;
    private LicenceRequisitionStatus status;
    private String creationDate;
    private String name;
    private Long PassportData;
    private String LastName;
    private Long age;
    private String SelectedValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPassportData() {
        return PassportData;
    }
    public void setPassportData(Long PassportData) {
        this.PassportData = PassportData;
    }
    public void setSelectedValue(String SelectedValue) {
        this.SelectedValue = SelectedValue;
    }

    public String getSelectedValue() {
        return SelectedValue;
    }


    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setStatus(LicenceRequisitionStatus status) {
        this.status = status;
    }
    public LicenceRequisitionStatus getStatus() {
        return status;
    }

    public Long getLicenceN() {
        return licenceN;
    }

    public void setLicenceN(Long licenceN) {
        this.licenceN = licenceN;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
