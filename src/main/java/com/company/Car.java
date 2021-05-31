package com.company;

import lombok.Data;

@Data
public class Car {
    private int id;
    private String identifier;
    private int disabled;
    private int type;
    private float latitude;
    private float longitude;
    private int speed;
    private String location = "";
}
