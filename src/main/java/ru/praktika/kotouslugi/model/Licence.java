package ru.praktika.kotouslugi.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Table(name = "licence")
public class Licence {
    @Id
    @GeneratedValue(generator = "sequence-generator-1")
    @GenericGenerator(
            name = "sequence-generator-1",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "licence_seq"),
                    @Parameter(name = "initial_value", value = "10000001"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long licenceId;
    private String name;
    private String description;
    private String requirements;
    private Long expiration;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }
}
