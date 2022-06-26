package com.cab.management.model;

import java.util.Date;

public class Trip {

	private int id;
	private Customer rider;
	private Cab cab;
	private City from;
	private City to;
	private Date start;
	private Date end;

	private Double fare;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public City getFrom() {
		return from;
	}

	public void setFrom(City from) {
		this.from = from;
	}

	public City getTo() {
		return to;
	}

	public void setTo(City to) {
		this.to = to;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Customer getRider() {
		return rider;
	}

	public void setRider(Customer rider) {
		this.rider = rider;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trip other = (Trip) obj;
		if (id != other.id)
			return false;
		return true;
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
