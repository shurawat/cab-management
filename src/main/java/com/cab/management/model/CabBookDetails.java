package com.cab.management.model;

import java.util.Date;

import com.cab.management.enums.CabType;

public class CabBookDetails {

	private CabType type;
	private String to;
	private String from;
	private Date start;
	private Date end;

	public CabType getType() {
		return type;
	}

	public void setType(CabType type) {
		this.type = type;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
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
