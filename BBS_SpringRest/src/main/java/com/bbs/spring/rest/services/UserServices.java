package com.bbs.spring.rest.services;

import java.util.List;

import com.bbs.spring.beans.Bus;
import com.bbs.spring.beans.Ticket;
import com.bbs.spring.beans.User;

public interface UserServices {
	public User createUser(User user);
	public User updateUser(Integer userId,String oldPassword, String newPassword);
	public User deleteUser(Integer userId,String password);
	public User loginUser(Integer userId,String password);
	public User searchUser(Integer userId);

	
	//ticket booking
	public Ticket bookTicket(Ticket ticket);
	public Boolean cancelTicket(Integer bookingId,Integer userId);
	public Ticket getTicket(Integer bookingId,Integer userId);
	public Integer checkAvailability(Integer busId,java.sql.Date availdate);
	public List <Bus>checkAvailability(String source,String destination,java.sql.Date date);
	String checkemail(String email);
	Long checkContact(String contact);
	Integer idCheck(String userId);
	boolean nameCheck(String name);
	Long regexcontact(String contact);


}
