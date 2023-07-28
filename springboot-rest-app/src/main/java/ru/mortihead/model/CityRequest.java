package ru.mortihead.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CityRequest implements Serializable {
    private String index;
    private User[] user;
    private Integer foundingYear;
    private String regionName;
    private Boolean isMetro;
}