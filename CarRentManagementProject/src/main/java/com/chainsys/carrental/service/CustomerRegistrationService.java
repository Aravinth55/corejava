package com.chainsys.carrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.carrental.pojo.CustomerRegistration;
import com.chainsys.carrental.repository.CustomerRegistrationRepository;

@Service
public class CustomerRegistrationService {
	@Autowired
	private CustomerRegistrationRepository crrepo;

	public List<CustomerRegistration> getCustomers() {
		List<CustomerRegistration> listCr = crrepo.findAll();
		return listCr;
	}
	public CustomerRegistration save(CustomerRegistration cr) {

		return crrepo.save(cr);
	}
	public CustomerRegistration findById(int id) {
		return crrepo.findById(id);
	}
//	@Transactional
	public void deleteById(int id) {
		crrepo.deleteById(id);
	}
}
