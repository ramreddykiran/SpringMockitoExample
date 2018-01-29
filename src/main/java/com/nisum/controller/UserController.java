package com.nisum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nisum.domain.User;
import com.nisum.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/user-details/{user-id}", method = RequestMethod.GET)
	public ResponseEntity<User> gtUserDetails(@PathVariable String userId) {
		User user = userService.getUserDetails(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	
	
}
