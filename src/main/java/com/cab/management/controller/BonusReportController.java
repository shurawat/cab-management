package com.cab.management.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cab.management.enums.CabState;
import com.cab.management.model.Trip;
import com.cab.management.services.IBonusReportService;

@RestController
public class BonusReportController {
	
	@Autowired
	IBonusReportService bonusReportService;
	
	@GetMapping("/cab/{cabId}")
	public List<Trip> searchCab(@PathVariable String cabId,  @RequestParam CabState cabState, @RequestParam Date start, @RequestParam Date end) {
		
		return bonusReportService.searchCab(cabId, cabState, start, end);
	}

}
