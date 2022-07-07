package ru.praktika.kotouslugi.model;

import ru.praktika.kotouslugi.model.enums.LicenceRequisitionStatus;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "licenceRequisition")
public class LicenceRequisition implements Serializable {
    @Id
    @GeneratedValue
    private int licenceN;
    private LicenceRequisitionStatus status;
    private int licenceId;
    private int personId;
    private String creationDate;


    public LicenceRequisition(LicenceRequisitionStatus status) {
        this.status = status;
    }

    public int getLicenceN() {
        return licenceN;
    }

    public void setLicenceN(int licenceN) {
        this.licenceN = licenceN;
    }

    public int getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(int licenceId) {
        this.licenceId = licenceId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public LicenceRequisitionStatus getStatus() {
        return status;
    }

    public void setStatus(LicenceRequisitionStatus status) {
        this.status = status;
    }


}
