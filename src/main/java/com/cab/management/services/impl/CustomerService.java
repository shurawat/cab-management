package com.cab.management.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cab.management.exceptions.CustomerAlreadyPresentException;
import com.cab.management.model.Customer;
import com.cab.management.repository.ICustomerRepository;
import com.cab.management.services.ICustomerService;

@Service
public class CustomerService implements ICustomerService {

	private ICustomerRepository customerRepository;
	
	public CustomerService(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void addNewCustomer(Customer customer) throws CustomerAlreadyPresentException {
		if(customerRepository.getCustomerByAadhar(customer.getAadharNumber()).isPresent()) {
			throw new CustomerAlreadyPresentException("Cannot create new customer as Customer already exist with aadhar " + customer.getAadharNumber());
		}
		customerRepository.insert(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}

}
