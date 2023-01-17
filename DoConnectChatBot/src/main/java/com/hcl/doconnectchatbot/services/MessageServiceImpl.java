package com.hcl.doconnectchatbot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.doconnectchatbot.dto.MessageDTO;
import com.hcl.doconnectchatbot.entity.Message;
import com.hcl.doconnectchatbot.repo.IMessageRepo;

@Service
public class MessageServiceImpl implements IMessageService
{
	@Autowired
	IMessageRepo chatRepo;

	@Override
	public MessageDTO sendMessage(MessageDTO messageDTO) 
	{
		Message message = new Message();
		message.setMessage(messageDTO.getMessage());
		message.setFromUser(messageDTO.getFromUser());
		message= chatRepo.save(message);
		messageDTO.setFromUser(message.getFromUser());
		messageDTO.setMessage(message.getMessage());
		return messageDTO;
	}

	@Override
	public List<MessageDTO> getMessage() {
		
		List<MessageDTO> data = new ArrayList<MessageDTO>();
		List<Message> messages = chatRepo.findAll();
		for(Message m : messages)
		{
			MessageDTO messageDTO = new MessageDTO();
		    messageDTO.setFromUser(m.getFromUser());
		    messageDTO.setMessage(m.getMessage());
		    data.add(messageDTO);
		}
		return data;
	}

}
