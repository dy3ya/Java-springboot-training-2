package com.bootcamp.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "dbo_dibangatodo")
public class todoModel {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description")
    private String description;

    public todoModel() {}

    public todoModel(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
