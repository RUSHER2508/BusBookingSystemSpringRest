package com.bbs.spring.rest.services;

import java.sql.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.bbs.spring.beans.Bus;
import com.bbs.spring.beans.Ticket;
import com.bbs.spring.beans.User;
import com.bbs.spring.rest.dao.DAOUser;
import com.bbs.spring.rest.dao.JPAUserImpl;

@Service
public class UserServiceImpl implements UserServices{
	Pattern pat=null;
	Matcher mat = null;

	DAOUser dao = new JPAUserImpl();

	public User createUser(User user) {
		return dao.createUser(user);
	}

	public User updateUser(Integer userId, String oldPassword, String newPassword) {
		return dao.updateUser(userId, oldPassword, newPassword);
	}

	public User deleteUser(Integer userId, String password) {
		return dao.deleteUser(userId, password);
	}

	public User loginUser(Integer userId, String password) {
		return dao.loginUser(userId, password);
	}

	public User searchUser(Integer userId) {
		return dao.searchUser(userId);
	}

	public Ticket bookTicket(Ticket ticket) {
		return dao.bookTicket(ticket);
	}

	public Boolean cancelTicket(Integer bookingId, Integer userId) {
		return dao.cancelTicket(bookingId, userId);
	}

	public Ticket getTicket(Integer bookingId, Integer userId) {
		return dao.getTicket(bookingId, userId);
	}

	public Integer checkAvailability(Integer busId, Date availdate) {
		return dao.checkAvailability(busId, availdate);
	}

	public List<Bus> checkAvailability(String source, String destination, Date date) {
		return dao.checkAvailability(source, destination, date);
	}

	public String checkemail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long checkContact(String contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer idCheck(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean nameCheck(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public Long regexcontact(String contact) {
		// TODO Auto-generated method stub
		return null;
	}

}
