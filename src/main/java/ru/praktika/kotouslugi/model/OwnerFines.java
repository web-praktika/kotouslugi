package ru.praktika.kotouslugi.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "Owners1" )
public class OwnerFines {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surname;
    private String middlename;
    private Integer passportnumber;
    private String phonenumber;

    public OwnerFines() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Integer getPassportnumber() {
        return passportnumber;
    }

    public void setPassportnumber(Integer passportnumber) {
        this.passportnumber = passportnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
