package com.nisum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nisum.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
}
