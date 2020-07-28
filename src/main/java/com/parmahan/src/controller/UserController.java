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

import com.parmahan.src.common.CommonStaticClass;
import com.parmahan.src.constant.Constants;
import com.parmahan.src.model.User;
import com.parmahan.src.service.UserService;



@Component
@RestController
@RequestMapping("/parmahan")
public class UserController {
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> users = userService.getUsers();
		logger.debug("retrieveAllUsers ");
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public ResponseEntity<User> createUser(@RequestBody Map<String, String> userMap){
		User user = new User();
		
		user.setId(CommonStaticClass.generateUUID());
		user.setFirstName(userMap.get("firstName"));
		user.setLastName(userMap.get("lastName"));
		user.setEmail(userMap.get("email"));
		user.setActive(Boolean.valueOf(userMap.get("active")));
		user.setInsertedAt(CommonStaticClass.getDate(Constants.NEXT_DATE, 1));
		user.setUpdatedAt(new Date());
		
		user = userService.createUser(user);
		logger.error("User " + user.getFirstName() + " has been successfully created.");
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	
}
