package com.chainsys.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.carrental.pojo.CarRegistration;
@Repository
public interface CarRegistrationRepository extends CrudRepository<CarRegistration, Integer> {
	CarRegistration findById(int id);

	CarRegistration save(CarRegistration car);

	void deleteById(int Car_Id);

	List<CarRegistration> findAll();
	
//	List<CarRegistration> getCarRegistrations();
}
