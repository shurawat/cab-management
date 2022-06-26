package com.cab.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cab.management.exceptions.CabNotAvailableException;
import com.cab.management.exceptions.CityNotFoundException;
import com.cab.management.exceptions.CustomerAlreadyPresentException;
import com.cab.management.exceptions.CustomerNotFoundException;
import com.cab.management.model.Cab;
import com.cab.management.model.CabBookDetails;
import com.cab.management.model.Customer;
import com.cab.management.services.ICabBookingService;
import com.cab.management.services.ICustomerService;


@RestController
public class UserController {
	
	@Autowired
	ICabBookingService cabBookingService;
	
	@Autowired
	ICustomerService customerService;
	
	@PostMapping("/user/{id}/cab/book")
	public Cab bookCab(@PathVariable String id, @RequestBody CabBookDetails cabBookDetails)
			throws CabNotAvailableException, CityNotFoundException, CustomerNotFoundException {
		return cabBookingService.bookCab(id, cabBookDetails);
	}
	
	@PostMapping("/user/register")
	public String registerUser(@RequestBody Customer customer)
			throws CabNotAvailableException, CityNotFoundException, CustomerAlreadyPresentException {
		customerService.addNewCustomer(customer);
		return "Added user successfully";
	}
	
	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllUsers() {
		return customerService.getCustomers();
	}
	
	

}
