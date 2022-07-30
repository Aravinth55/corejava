package com.chainsys.carrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.carrental.pojo.CarRegistration;
import com.chainsys.carrental.pojo.CarRental;
import com.chainsys.carrental.pojo.CustomerRegistration;
import com.chainsys.carrental.pojo.ReturnCar;
import com.chainsys.carrental.repository.CarRegistrationRepository;
import com.chainsys.carrental.repository.CarRentalRepository;
import com.chainsys.carrental.repository.CustomerRegistrationRepository;
import com.chainsys.carrental.repository.ReturnCarRepository;

@Service
public class ReturnCarService {
	@Autowired
	private ReturnCarRepository crtrepo;

	public List<ReturnCar> getReturnCars() {
		List<ReturnCar> listCre = crtrepo.findAll();
		return listCre;
	}

	public ReturnCar save(ReturnCar cr) {

		return crtrepo.save(cr);
	}

	public ReturnCar findById(int id) {
		return crtrepo.findById(id);
	}

//	@Transactional
	public void deleteById(int id) {
		crtrepo.deleteById(id);
	}
}
