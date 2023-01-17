package com.hcl.doconnectchatbot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.doconnectchatbot.dto.MessageDTO;
import com.hcl.doconnectchatbot.services.MessageServiceImpl;

@RestController
@RequestMapping("/chatbot")
public class MessageController {
	
	@Autowired
	MessageServiceImpl msgSer;
	
	@PostMapping("/sendMessage")
	public MessageDTO sendMessage(@RequestBody MessageDTO messageDTO)
	{
		return msgSer.sendMessage(messageDTO);
	}
	
	@GetMapping("/getMessage")
	public List<MessageDTO> getMessage()
	{
		return msgSer.getMessage();
	}
	
	
	
	

}
