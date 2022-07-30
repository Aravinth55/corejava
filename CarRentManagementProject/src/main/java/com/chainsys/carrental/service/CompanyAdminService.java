package com.chainsys.carrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.carrental.pojo.CarRegistration;
import com.chainsys.carrental.pojo.CarRental;
import com.chainsys.carrental.pojo.CompanyAdmin;
import com.chainsys.carrental.pojo.CustomerRegistration;
import com.chainsys.carrental.repository.CarRegistrationRepository;
import com.chainsys.carrental.repository.CarRentalRepository;
import com.chainsys.carrental.repository.CompanyAdminRepository;
import com.chainsys.carrental.repository.CustomerRegistrationRepository;

@Service
public class CompanyAdminService {
	@Autowired
	private CompanyAdminRepository cmrepo;

	public List<CompanyAdmin> getCompanyAdmins() {
		List<CompanyAdmin> listCre = cmrepo.findAll();
		return listCre;
	}

	public CompanyAdmin save(CompanyAdmin cr) {

		return cmrepo.save(cr);
	}

	public CompanyAdmin findById(int id) {
		return cmrepo.findById(id);
	}

//	@Transactional
	public void deleteById(int id) {
		cmrepo.deleteById(id);
	}
}
