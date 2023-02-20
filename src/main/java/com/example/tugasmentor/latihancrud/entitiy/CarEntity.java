package com.example.tugasmentor.latihancrud.entitiy;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String carName;

    private String type;

    private String number;

    private String color;
}
