package com.cab.management.repository.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cab.management.model.Admin;
import com.cab.management.repository.IAdminRepository;

@Component
public class AdminRepository implements IAdminRepository {
	

	Map<String, Admin> customerMap = new HashMap<>();

	public AdminRepository() {
		initialCustomerLoad();
	}
	

	public void initialCustomerLoad() {
		customerMap.put("4", new Admin("4", "admin1", "admin1", "1234 1234 1234 1200", "9772258522"));
		customerMap.put("5", new Admin("5", "admin2", "admin2", "1234 1234 1234 2201", "9772258511"));
		customerMap.put("6", new Admin("6", "admin3", "admon3", "1234 1234 1234 331z", "9772258571"));
	}

	@Override
	public void insert(Admin admin) {
		customerMap.put(admin.getId(), admin);
	}

	@Override
	public Admin getAdmin(String id) {
		return customerMap.get(id);
	}
}
