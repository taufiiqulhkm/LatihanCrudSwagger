package com.example.tugasmentor.latihancrud.repository;

import com.example.tugasmentor.latihancrud.entitiy.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
