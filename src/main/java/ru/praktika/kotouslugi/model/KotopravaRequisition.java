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
    private String nameRequisition;
    private RequisitionStatus status;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "kittens_id")
    private Kittens kittens;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "passport_id")
    private CatPassport passports;
    @OneToOne(cascade = {CascadeType.ALL})
    private  Certificates certificates;
    private String numGIBDD;
    private String dateGIBDD;
    private String timeGIBDD;

    public Kittens getKittens() {
        return kittens;
    }

    public void setKittens(Kittens kittens) {
        this.kittens = kittens;
    }

    public KotopravaRequisition() {

    }

    public KotopravaRequisition(String nameRequisition, RequisitionStatus status,
                                String numGIBDD, String dateGIBDD, String timeGIBDD){
        this.nameRequisition = nameRequisition;
        this.status = status;
        this.kittens = new Kittens();
        this.passports = new CatPassport();
        this.certificates = new Certificates();
        this.numGIBDD = numGIBDD;
        this.dateGIBDD = dateGIBDD;
        this.timeGIBDD = timeGIBDD;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRequisition() {
        return nameRequisition;
    }

    public void setNameRequisition(String nameRequisition) {
        this.nameRequisition = nameRequisition;
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


    public CatPassport getPassports() {
        return passports;
    }

    public void setPassports(CatPassport passports) {
        this.passports = passports;
    }

    public Certificates getCertificates() {
        return certificates;
    }

    public void setCertificates(Certificates certificates) {
        this.certificates = certificates;
    }

}
