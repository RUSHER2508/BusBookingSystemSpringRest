package com.bbs.spring.rest.dao;

import java.util.List;

import com.bbs.spring.beans.Admin;
import com.bbs.spring.beans.Bus;


public interface AdminDaoBBS {

	//bus manipulations
	
	public Bus createBus(Bus bus);   //For create operation of bus

	//For update operation of bus
	public Bus updateBus(String source,String destination,Double price,Integer busId);

	//For search operation using bus id
	public Bus searchBus(Integer busId);

	//For delete operation 
	public Bus deletebus(Integer busId);

	//For searching bus between source and destination
	public List<Bus> busBetween(String source,String destination);

	//admin
	public Admin adminLogin(Integer adminId, String password); //For admin login

}
