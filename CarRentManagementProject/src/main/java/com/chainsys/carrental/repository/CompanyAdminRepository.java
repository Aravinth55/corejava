package com.chainsys.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.carrental.pojo.CarRental;
import com.chainsys.carrental.pojo.CompanyAdmin;

@Repository
public interface CompanyAdminRepository extends CrudRepository<CompanyAdmin, Integer> {
	CompanyAdmin findById(int id);

	CompanyAdmin save(CarRental car);

	void deleteById(int Car_Id);

	List<CompanyAdmin> findAll();

//	List<CarRental> getCompanyAdmin();
}
