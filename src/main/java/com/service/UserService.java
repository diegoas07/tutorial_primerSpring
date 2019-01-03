package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.User;
import com.persistence.LocalImp;

@Component
public class UserService {

	@Autowired
	private LocalImp localImp;
	
	public User login(User user) throws Exception {
		return localImp.consultaUser(user);
	}
	
}
