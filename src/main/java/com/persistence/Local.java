package com.persistence;

import com.model.User;

public interface Local {
	
	public User consultaUser(User user) throws Exception;
	
}
