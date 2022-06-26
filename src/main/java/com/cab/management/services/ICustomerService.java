package com.cab.management.services;

import java.util.List;

import com.cab.management.exceptions.CustomerAlreadyPresentException;
import com.cab.management.model.Customer;

public interface ICustomerService {
	
	public void addNewCustomer(Customer customer) throws CustomerAlreadyPresentException;
	public List<Customer> getCustomers();

}
