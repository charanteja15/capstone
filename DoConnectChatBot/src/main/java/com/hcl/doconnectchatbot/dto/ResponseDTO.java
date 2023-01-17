package com.hcl.doconnectchatbot.dto;

public class ResponseDTO {
	
	private String response;

	public ResponseDTO() {
		super();
	}

	public ResponseDTO(String response) {
		super();
		this.response = response;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ResponseDTO [response=" + response + "]";
	}
	
	

}
