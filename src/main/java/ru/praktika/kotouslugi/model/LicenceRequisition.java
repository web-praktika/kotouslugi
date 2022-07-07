package ru.praktika.kotouslugi.model;

import ru.praktika.kotouslugi.model.enums.LicenceRequisitionStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "Licence_requisition")
public class LicenceRequisition implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private LicenceRequisitionStatus status;
    private int serviceId;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Field> fields;

    public LicenceRequisition() {
    }


    public LicenceRequisition(String name, LicenceRequisitionStatus status, Integer serviceId) {
        this.name = name;
        this.status = status;
        this.fields = new LinkedList<>();
        this.serviceId = serviceId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenceRequisitionStatus getStatus() {
        return status;
    }

    public void setStatus(LicenceRequisitionStatus status) {
        this.status = status;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
