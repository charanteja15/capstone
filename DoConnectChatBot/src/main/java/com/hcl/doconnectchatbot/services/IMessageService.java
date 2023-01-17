package com.hcl.doconnectchatbot.services;

import java.util.List;

import com.hcl.doconnectchatbot.dto.MessageDTO;

public interface IMessageService {
	
	public MessageDTO sendMessage(MessageDTO messageDTO);
	
	public List<MessageDTO> getMessage();

}
