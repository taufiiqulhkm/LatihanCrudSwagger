package com.example.tugasmentor.latihancrud.services.impl;

import com.example.tugasmentor.latihancrud.entitiy.CarEntity;
import com.example.tugasmentor.latihancrud.repository.CarRepository;
import com.example.tugasmentor.latihancrud.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;

    @Override
    public CarEntity addCar(CarEntity param) {
        carRepository.save(param);
        return param;
    }

    @Override
    public List<CarEntity> getallcar() {
        return carRepository.findAll();
    }

    @Override
    public CarEntity getCarById(long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public CarEntity updateCar(CarEntity param) {
        return carRepository.save(param);
    }

    @Override
    public void deleteCar(long id) {
        carRepository.deleteById(id);
    }
}
