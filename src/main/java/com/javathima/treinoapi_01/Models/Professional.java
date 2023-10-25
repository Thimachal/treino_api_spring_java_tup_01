package com.javathima.treinoapi_01.Models;

public class Professional {

    private Integer id;
    private String name;

    public Professional(){

    }
    public Professional(Integer id, String name) {
        this.id = id;
        this.name = name;
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
