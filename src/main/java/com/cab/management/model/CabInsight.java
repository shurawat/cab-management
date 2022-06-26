package com.cab.management.model;

import java.util.Date;

import com.cab.management.enums.CabState;

public class CabInsight {

	private String id;
	private CabState cabState;
	private Date start;
	private Date end;

	public CabInsight(String id, CabState cabState, Date start, Date end) {

		this.id = id;
		this.cabState = cabState;
		this.start = start;
		this.end = end;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CabState getCabState() {
		return cabState;
	}

	public void setCabState(CabState cabState) {
		this.cabState = cabState;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

}
