package ru.mortihead.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CityEntity implements Serializable {
    private Integer id;
    private String name;
    private Integer population;

    public CityEntity(Integer id, String name, Integer population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }
}