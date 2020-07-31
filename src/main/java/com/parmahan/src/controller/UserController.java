package com.parmahan.src.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parmahan.src.common.CommonStatic;
import com.parmahan.src.constant.Constants;
import com.parmahan.src.model.User;
import com.parmahan.src.service.UserService;



@Component
@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> users = userService.getAll();
		logger.debug("retrieveAllUsers ");
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public ResponseEntity<User> createUser(@RequestBody Map<String, String> userMap){
		User user = new User();
		
		user.setId(CommonStatic.generateUUID());
		user.setUserName("andryanstgkr");
		user.setFirstName(userMap.get("firstName"));
		user.setLastName(userMap.get("lastName"));
		user.setEmail(userMap.get("email"));
		user.setPassword(CommonStatic.encodePassword(userMap.get("password")));
		user.setActive(Boolean.valueOf(userMap.get("active")));
		user.setInsertedAt(CommonStatic.getDate(Constants.NEXT_DATE, 1));
		user.setUpdatedAt(new Date());
		
		user = userService.create(user);
		logger.error("User " + user.getFirstName() + " has been successfully created.");
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<User> login(@RequestBody Map<String, String> userMap){
		User user = new User();
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ResponseEntity<User> logout(@RequestBody Map<String, String> userMap){
		User user = new User();
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
