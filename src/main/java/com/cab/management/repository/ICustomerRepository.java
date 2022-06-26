package com.cab.management.repository;

import java.util.List;
import java.util.Optional;

import com.cab.management.model.Customer;

public interface ICustomerRepository {

	public void insert(Customer customer);

	public Customer getCustomer(String id);

	public Optional<Customer> getCustomerByAadhar(String aadhar);
	
	public List<Customer> getCustomers();

}
