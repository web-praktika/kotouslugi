package ru.praktika.kotouslugi.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Table(name = "licence")
public class Licence {
    @Id
    @GeneratedValue
    private Long licenceId;
    private String name;
    private Long PassportData;
    private String LastName;
    private Long age;
    private String SelectedValue;

    public Long getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(Long licenceId) {
        this.licenceId = licenceId;
    }

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
}
