package com.company;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "transports")
public class Car {
    @Id
    private int id;
    private String identifier;
    private int disabled;
    private int type;
    private float latitude;
    private float longitude;
    private int speed;
    private String location = "";
}
