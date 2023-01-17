package com.hcl.doconnectapp.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.hcl.doconnectapp.entity.User;
import com.hcl.doconnectapp.exception.UserNotFoundException;
import com.hcl.doconnectapp.repository.UserRepository;
import com.hcl.doconnectapp.utility.Message;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ObjectMapper mapper;

	@Override
	public ResponseEntity<String> userRegistration(User user) {
		ResponseEntity<String> responseEntity = null;
		User user2 = userRepository.save(user);
		if (user2 != null) {
			responseEntity = new ResponseEntity<String>("User is Added..!", HttpStatus.ACCEPTED);
			
		}else {
			responseEntity = new ResponseEntity<String>("User is not added..!", HttpStatus.BAD_REQUEST);
		}
		
		return responseEntity;
	}

	@Override
	public String userLogin(User user) throws UserNotFoundException{
		
		if(userRepository.findByUserNameAndPassword(user.getUserName(),user.getUserPassword())!=null) {
			System.out.println("Username is"+user.getUserName());
			return "User login successfully..!";
		}else {
			UserNotFoundException err = new UserNotFoundException("User not found");
			throw err;
		}
		
	}
	
	@Override
	public Message sendMessage(Message message) throws JsonProcessingException {

		String url = "http://localhost:9093/chatbot/sendMessage";
		var headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		var entity = new HttpEntity<>(mapper.writeValueAsString(message), headers);
		ResponseEntity<Message> responseEntity = restTemplate.postForEntity(url, entity, Message.class);
		Message response = responseEntity.getBody();

		return response;
	}

}

