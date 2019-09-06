package com.bbs.spring.rest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bbs.spring.beans.Bus;
import com.bbs.spring.beans.Ticket;
import com.bbs.spring.beans.User;

public interface DAOUser {
	//user manipulation
		public User createUser(User user); //For create user operation
		
		//For  update user operation
		public User updateUser(Integer userId,String oldPassword,String newPassword);
		
		public User loginUser(Integer userId,String password); //For  login of user
		
		public User searchUser(Integer userId);   //For searching of user using user id
		
		//For delete operation of user
		public User deleteUser(Integer userId,String password);
		
		
		//ticket booking
		public Ticket bookTicket(Ticket ticket);  //For booking tickets
		
		public Boolean cancelTicket(Integer bookingId,Integer userId);	 //For cancelling ticket
		
		//For getting ticket
		Ticket getTicket(Integer bookingId, Integer userId);
		
		 //For checking availability from bus id and date
		public Integer checkAvailability(Integer busId,java.sql.Date availdate);
		
		//For checking availability from source,destination and date
		public List <Bus>checkAvailability(String source,String destination,java.sql.Date date);


}
