package com.chainsys.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.carrental.pojo.ReturnCar;

@Repository
public interface ReturnCarRepository extends CrudRepository<ReturnCar, Integer> {
	ReturnCar findById(int id);

	ReturnCar save(ReturnCar car);

	void deleteById(int Car_Id);

	List<ReturnCar> findAll();

//	List<ReturnCar> getReturnCars();
}
