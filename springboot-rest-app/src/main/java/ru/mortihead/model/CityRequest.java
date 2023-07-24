package ru.mortihead.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CityRequest implements Serializable {
    private String Index;
}