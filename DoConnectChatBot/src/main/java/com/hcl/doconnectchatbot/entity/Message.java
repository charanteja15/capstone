package com.hcl.doconnectchatbot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String message;
	private String fromUser;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(long id, String message, String fromUser) {
		super();
		this.id = id;
		this.message = message;
		this.fromUser = fromUser;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFromUser() {
		return fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", fromUser=" + fromUser + "]";
	}
	
	

}
