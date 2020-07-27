package com.parmahan.src.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.parmahan.src.dao.UserDao;
import com.parmahan.src.dao.impl.UserDaoImpl;
import com.parmahan.src.service.UserService;
import com.parmahan.src.service.impl.UserServiceImpl;

@Configuration
public class GeneralConfig {

	@Bean
	public UserService userService() {

		return new UserServiceImpl();
	}

	@Bean
	public UserDao userDao() {
		
		return new UserDaoImpl();
	}
}
