package com.hcl.doconnectchatbot.dto;

public class MessageDTO {
	
	private String fromUser;
	private String message;
	
	public MessageDTO() {
		super();
	}

	public MessageDTO(String fromUser, String message) {
		super();
		this.fromUser = fromUser;
		this.message = message;
	}

	public String getFromUser() {
		return fromUser;
	}

	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageDTO [fromUser=" + fromUser + ", message=" + message + "]";
	}
	
	
	

}
