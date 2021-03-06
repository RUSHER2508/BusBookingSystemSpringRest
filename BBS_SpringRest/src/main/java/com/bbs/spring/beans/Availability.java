package com.bbs.spring.beans;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="available_info")

public class Availability {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int availableId;
	@Temporal(TemporalType.DATE)
	private Date availableDate;
	private int availableSeats;
	@Column(name="bus_id")
	private int busId;
	public int getAvailableId() {
		return availableId;
	}
	public void setAvailableId(int availableId) {
		this.availableId = availableId;
	}
	public Date getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	@Override
	public String toString() {
		return "Available [availableId=" + availableId + ", availableDate=" + availableDate + ", availableSeats="
				+ availableSeats + ", busId=" + busId + "]";
	}
	
	

}
