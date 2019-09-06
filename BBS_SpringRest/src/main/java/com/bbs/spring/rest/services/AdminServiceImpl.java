package com.bbs.spring.rest.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bbs.spring.beans.Admin;
import com.bbs.spring.beans.Bus;
import com.bbs.spring.rest.dao.AdminDaoBBS;
import com.bbs.spring.rest.dao.JPAAdminImpl;

@Service
public class AdminServiceImpl implements AdminServices{
AdminDaoBBS dao = new JPAAdminImpl();

public Bus createBus(Bus bus) {
	return dao.createBus(bus);
}

public Bus updateBus(String source, String destination, Double price, Integer busId) {
	return dao.updateBus(source, destination, price, busId);
}

public Bus searchBus(Integer busId) {
	return dao.searchBus(busId);
}

public Bus deletebus(Integer busId) {
	return dao.deletebus(busId);
}

public List<Bus> busBetween(String source, String destination) {
	return dao.busBetween(source, destination);
}

public Admin adminLogin(Integer adminId, String password) {
	return dao.adminLogin(adminId, password);
}

}
