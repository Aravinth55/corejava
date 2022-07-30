package com.chainsys.carrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.carrental.pojo.CarRegistration;
import com.chainsys.carrental.pojo.CustomerRegistration;
import com.chainsys.carrental.repository.CarRegistrationRepository;
import com.chainsys.carrental.repository.CustomerRegistrationRepository;

@Service
public class CarRegistrationService {
	@Autowired
	private CarRegistrationRepository carrepo;

	public List<CarRegistration> getCars() {
		List<CarRegistration> listCar = carrepo.findAll();
		return listCar;
	}

	public CarRegistration save(CarRegistration cr) {

		return carrepo.save(cr);
	}

	public CarRegistration findById(int id) {
		return carrepo.findById(id);
	}

//	@Transactional
	public void deleteById(int id) {
		carrepo.deleteById(id);
	}
}
