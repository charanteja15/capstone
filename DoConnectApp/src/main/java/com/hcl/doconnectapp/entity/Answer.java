package com.hcl.doconnectapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_table")
public class Answer {
	
	
	@Id //To make primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descAnswer;
	private String imgSrc;
	private String status;
	private String dateTime;
	
	@ManyToOne
	private Question question;	
	private String approvedBy;
	private String createdBy;
	
	
	public Answer() {
		super();
	}

	public Answer(long id, String descAnswer, String imgSrc, String status, String dateTime, Question question,
			String approvedBy, String createdBy) {
		super();
		this.id = id;
		this.descAnswer = descAnswer;
		this.imgSrc = imgSrc;
		this.status = status;
		this.dateTime = dateTime;
		this.question = question;
		this.approvedBy = approvedBy;
		this.createdBy = createdBy;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescAnswer() {
		return descAnswer;
	}

	public void setDescAnswer(String descAnswer) {
		this.descAnswer = descAnswer;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", descAnswer=" + descAnswer + ", imgSrc=" + imgSrc + ", status=" + status
				+ ", dateTime=" + dateTime + ", question=" + question + ", approvedBy=" + approvedBy + ", createdBy="
				+ createdBy + "]";
	}
}