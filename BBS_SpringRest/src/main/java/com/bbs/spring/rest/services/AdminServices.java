package com.bbs.spring.rest.services;

import java.util.HashMap;
import java.util.List;

import com.bbs.spring.beans.Admin;
import com.bbs.spring.beans.Bus;

public interface AdminServices {
	//bus manipulations
	public Bus createBus(Bus bus);
	public Bus updateBus(String source,String destination,Double price,Integer busId);
	public Bus searchBus(Integer busId);
	public Bus deletebus(Integer busId);
	public List<Bus> busBetween(String source,String destination);

	//admin
	public Admin adminLogin(Integer adminId, String password);

}
