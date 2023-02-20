package com.example.tugasmentor.latihancrud.services;

import com.example.tugasmentor.latihancrud.entitiy.CarEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService{

    CarEntity addCar (CarEntity param);

    List<CarEntity> getallcar();

    CarEntity getCarById(long id);

    CarEntity updateCar(CarEntity param);

    void deleteCar(long id);
}
