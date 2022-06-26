package com.cab.management.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cab.management.model.Customer;
import com.cab.management.repository.ICustomerRepository;

@Component
public class CustomerRepository implements ICustomerRepository {

	
	Map<String, Customer> customerMap = new HashMap<>();

	public CustomerRepository() {
		initialCustomerLoad();
	}
	
	public void initialCustomerLoad() {
		customerMap.put("1", new Customer("1", "Shubham", "Rawat", "1234 1234 1234 1234", "9772258585"));
		customerMap.put("2", new Customer("2", "Niharika", "Singh", "1234 1234 1234 2222", "9772258586"));
		customerMap.put("3", new Customer("3", "Mohit", "Arora", "1234 1234 1234 3333", "9772258587"));
	}

	@Override
	public void insert(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}

	@Override
	public Customer getCustomer(String id) {
		return customerMap.get(id);
	}

	@Override
	public Optional<Customer> getCustomerByAadhar(String aadhar) {
		return customerMap.values().stream().filter(c -> c.getAadharNumber().equals(aadhar)).findFirst();
	}

	@Override
	public List<Customer> getCustomers() {
		return customerMap.values().stream().collect(Collectors.toList());
	}

}
