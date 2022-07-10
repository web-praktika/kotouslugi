package ru.praktika.kotouslugi.model;

import org.hibernate.annotations.GenericGenerator;
import ru.praktika.kotouslugi.model.enums.LicenceRequisitionStatus;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "licenceRequisition")
public class LicenceRequisition implements Serializable {
    @Id
    @GeneratedValue
    private Long licenceN;
    private LicenceRequisitionStatus status;
    private Long licenceId;
    private Long personId;
    private String creationDate;


    public LicenceRequisition(LicenceRequisitionStatus status) {
        this.status = status;
    }

    public Long getLicenceN() {
        return licenceN;
    }

    public void setLicenceN(Long licenceN) {
        this.licenceN = licenceN;
    }

    public Long getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(Long licenceId) {
        this.licenceId = licenceId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
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
