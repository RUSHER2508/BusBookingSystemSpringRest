package com.bbs.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bbs.spring.beans.User;
import com.bbs.spring.rest.services.UserServices;

@RestController
public class UserController {

	@Autowired
	UserServices services;
	
	
	@RequestMapping(value = "/user/createUser", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		User users = services.createUser(user);
		return users;
	}

	@RequestMapping(value = "/user/deleteUser/{userId}/{password}", method = RequestMethod.DELETE)
	public User deleteUser(@PathVariable("userId") int userId,@PathVariable("password") String password) {
		User users = services.deleteUser(userId, password);
		return users;
	}
	
	@RequestMapping(value = "/user/searchUser/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable("userId") int userId) {
		User users = services.searchUser(userId);
		return users;
		
	}
	
	@RequestMapping(value = "/user/updateUser/{userId}/{oldPassword}/{newPassword}", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user,@PathVariable("userId") int userId,@PathVariable("oldPassword") String oldPassword,@PathVariable("newPassword") String newPassword) {
		User users = services.updateUser(userId, oldPassword, newPassword);
		if(users!= null) {
			User user1 =services.searchUser(userId);

			return user1;
		}
		return users;
	
	}
}
