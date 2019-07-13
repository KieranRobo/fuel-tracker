package com.kieran.fueltracker.database;

import com.kieran.fueltracker.model.FillUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FuelRepository extends JpaRepository<FillUp, String> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO fillups (registration, mileage, litres_filled, cost) VALUES (:registration, :mileage, :litresFilled, :cost)", nativeQuery = true)
    void insertNewFillUp(String registration, int mileage, double litresFilled, double cost);

}
