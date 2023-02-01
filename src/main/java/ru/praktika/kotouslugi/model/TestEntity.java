package ru.praktika.kotouslugi.model;

import javax.persistence.*;

@Entity
@Table(name="test_table")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Integer id;
    private String text;

    public Integer getId() {
        return id;
    }

    public TestEntity() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
