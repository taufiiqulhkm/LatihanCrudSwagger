package com.example.tugasmentor.latihancrud.controller;

import com.example.tugasmentor.latihancrud.entitiy.CarEntity;
import com.example.tugasmentor.latihancrud.services.CarService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@Api (value = "Car Controller")
public class CarController {

    @Autowired
    CarService carService;


    //TODO: GET SEMUA CAR

    @GetMapping("/getAllCar")
    @Operation (description = "API untuk melihat jenis mobil")
    public  List <CarEntity> getAllCar(){

        List<CarEntity> carList =carService.getallcar();

        return carList;
    }


    //TODO: POST EMPLOYEE BARU
    @PostMapping("/addNewCar")
    @Operation (description = "API untuk menambahkan jenis mobil")
    public CarEntity addNewCar(@RequestBody CarEntity param){

        CarEntity car = carService.addCar(param);

        return car;

    }

    //TODO: GET DETAIL car
    @GetMapping("/getById")
    @Operation (description = "API untuk mencari data by id")
    public CarEntity getById(@RequestParam long id){

        CarEntity car = carService.getCarById(id);

        return car;
    }


    //TODO: DELETE DATA CAR
    @DeleteMapping("/deleteCar")
    @Operation(description = "API untuk menghapus jenis mobil")
    public List <CarEntity> deleteCar(@RequestParam long id){

        carService.deleteCar(id);

        return carService.getallcar();
    }

    //TODO: PUT/EDIT DATA CAR

    @PostMapping("/updateCar")
    @Operation(description = "API untuk mengupdate jenis mobil")
    public CarEntity updateCar(@RequestBody CarEntity param){
        CarEntity car = carService.updateCar(param);
        return car;
    }
}
