package com.hcl.doconnectapp.services;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hcl.doconnectapp.entity.User;
import com.hcl.doconnectapp.exception.UserNotFoundException;
import com.hcl.doconnectapp.utility.Message;

public interface IUserService {

	public ResponseEntity<String> userRegistration(User user);

	public String userLogin(User user) throws UserNotFoundException;
	
	public Message sendMessage(Message message)  throws JsonProcessingException;

}