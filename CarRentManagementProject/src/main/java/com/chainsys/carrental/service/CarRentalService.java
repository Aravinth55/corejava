package com.chainsys.carrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.carrental.pojo.CarRegistration;
import com.chainsys.carrental.pojo.CarRental;
import com.chainsys.carrental.pojo.CustomerRegistration;
import com.chainsys.carrental.repository.CarRegistrationRepository;
import com.chainsys.carrental.repository.CarRentalRepository;
import com.chainsys.carrental.repository.CustomerRegistrationRepository;

@Service
public class CarRentalService {
	@Autowired
	private CarRentalRepository crerepo;

	public List<CarRental> getCarRentals() {
		List<CarRental> listCre = crerepo.findAll();
		return listCre;
	}

	public CarRental save(CarRental cr) {

		return crerepo.save(cr);
	}

	public CarRental findById(int id) {
		return crerepo.findById(id);
	}

//	@Transactional
	public void deleteById(int id) {
		crerepo.deleteById(id);
	}
}
