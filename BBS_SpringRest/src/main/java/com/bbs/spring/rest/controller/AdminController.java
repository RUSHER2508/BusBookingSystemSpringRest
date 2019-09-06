package com.bbs.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bbs.spring.beans.Admin;
import com.bbs.spring.beans.Bus;
import com.bbs.spring.rest.services.AdminServices;


@RestController
public class AdminController {
	@Autowired
	AdminServices services;

	@RequestMapping(value = "/rest/bus/create", method = RequestMethod.POST)
	public Bus createBus(@RequestBody Bus bus) {
		Bus check = services.createBus(bus);
			return check;
			}

	@RequestMapping(value = "/rest/bus/delete/{id}", method = RequestMethod.DELETE)
	public Bus deleteBus(@PathVariable("id") int busId) {

		Bus check = services.deletebus(busId);
		if(check != null) {
			Bus bus = services.searchBus(busId);
			return bus;
		}
		return null;
	}

	@RequestMapping(value = "/rest/bus/{id}", method = RequestMethod.GET)
	public Bus getBus(@PathVariable("id") int busId) {

		Bus bus = services.searchBus(busId);
		if(bus != null) {
			return bus;
		}
		return null;
	}

	@RequestMapping(value = "/rest/bus/update/{busId}/{source}/{destination}/{price}", method = RequestMethod.PUT)
	public Bus updateBus(@RequestBody Bus bus,@PathVariable ("source") String source,@PathVariable("destination") String destination,@PathVariable("price") Double price,@PathVariable("busId") Integer busId)  {
		Bus check = services.updateBus(source, destination, price, busId);
		if(check != null) {
			return bus;
		}
		return null;
	}

	@RequestMapping(value = "/rest/admin/login", method = RequestMethod.POST)
	public Admin loginAdmin(@RequestBody Admin admin) {
		Admin check = services.adminLogin(admin.getAdminId(),admin.getPassword());
		if(check != null) {
			return admin;
		}
		return null;
	}


}
