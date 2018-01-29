package com.nisum.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.nisum.domain.User;
import com.nisum.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	@InjectMocks
	private UserController userController;
	
	@Mock
	private UserService userService;
	
	@Test
	public void shouldRetrieveUserDetailsForGivenUserId() {
		User user = new User();
		user.setUserId("userId1");
		user.setUserName("userName1");
		when(userService.getUserDetails(anyString())).thenReturn(user);
		ResponseEntity<User> response = userController.gtUserDetails("userId1");
		assertEquals(user, response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}

}
