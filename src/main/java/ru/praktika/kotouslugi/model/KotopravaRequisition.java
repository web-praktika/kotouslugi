package ru.praktika.kotouslugi.model;

import ru.praktika.kotouslugi.model.enums.RequisitionStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
@Entity
@Table(name = "prava_requisition")
public class KotopravaRequisition implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private RequisitionStatus status;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Kittens> kittens;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<CatPassport> passports;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private  List<Certificates> certificates;
    private String numGIBDD;
    private String dateGIBDD;
    private String timeGIBDD;
    private int serviceId;

    public KotopravaRequisition() {

    }

    public KotopravaRequisition(String name, RequisitionStatus status,
                                String numGIBDD, String dateGIBDD, String timeGIBDD,Integer serviceId){
        this.name = name;
        this.status = status;
        this.kittens = new LinkedList<>();
        this.passports = new LinkedList<>();
        this.certificates = new LinkedList<>();
        this.numGIBDD = numGIBDD;
        this.dateGIBDD = dateGIBDD;
        this.timeGIBDD = timeGIBDD;
        this.serviceId = serviceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RequisitionStatus getStatus() {
        return status;
    }

    public void setStatus(RequisitionStatus status) {
        this.status = status;
    }

    public String getNumGIBDD() {
        return numGIBDD;
    }

    public void setNumGIBDD(String numGIBDD) {
        this.numGIBDD = numGIBDD;
    }

    public String getDateGIBDD() {
        return dateGIBDD;
    }

    public void setDateGIBDD(String dateGIBDD) {
        this.dateGIBDD = dateGIBDD;
    }

    public String getTimeGIBDD() {
        return timeGIBDD;
    }

    public void setTimeGIBDD(String timeGIBDD) {
        this.timeGIBDD = timeGIBDD;
    }

    public List<Kittens> getKittens() {
        return kittens;
    }

    public void setKittens(List<Kittens> kittens) {
        this.kittens = kittens;
    }

    public List<CatPassport> getPassports() {
        return passports;
    }

    public void setPassports(List<CatPassport> passports) {
        this.passports = passports;
    }

    public List<Certificates> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificates> certificates) {
        this.certificates = certificates;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }
}
