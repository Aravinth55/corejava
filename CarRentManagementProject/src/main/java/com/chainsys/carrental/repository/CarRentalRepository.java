package com.chainsys.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.carrental.pojo.CarRental;

@Repository
public interface CarRentalRepository extends CrudRepository<CarRental, Integer> {
	CarRental findById(int id);

	CarRental save(CarRental car);

	void deleteById(int Car_Id);

	List<CarRental> findAll();

//	List<CarRental> getCarRental();
}
