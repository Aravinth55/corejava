package com.chainsys.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.carrental.pojo.CustomerRegistration;
@Repository
public interface CustomerRegistrationRepository extends CrudRepository<CustomerRegistration, Integer> {
	CustomerRegistration findById(int id);

	CustomerRegistration save(CustomerRegistration crs);

	void deleteById(int Customer_Id);

	List<CustomerRegistration> findAll();
	
//	List<CustomerRegistration> getCustomerRegistrations();
}
