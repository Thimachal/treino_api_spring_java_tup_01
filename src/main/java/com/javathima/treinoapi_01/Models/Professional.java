package com.javathima.treinoapi_01.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Professional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    public LocalDateTime getDateCriation() {
        return dateCriation;
    }

    public void setDateCriation(LocalDateTime dateCriation) {
        this.dateCriation = dateCriation;
    }

    private LocalDateTime dateCriation;

    public Professional(){

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
}
