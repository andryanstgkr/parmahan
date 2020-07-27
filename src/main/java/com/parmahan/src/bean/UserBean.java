package com.parmahan.src.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserBean implements ApplicationContextAware {
	private String applicationId;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		applicationId = applicationContext.getId();
	}

	public String getApplicationId() {

		return applicationId;
	}

}
