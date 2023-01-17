package com.hcl.doconnectapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "question_table")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String questionDescription;
	private String imgSrc;
	private String dateTime;
	private String status;
	private String topic;
	private String title;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private List<Answer> answers;
	private String questionCreatedBy;
	private String questionApprovedBy;
	
	
	public Question() {
		super();
	}


	public Question(long id, String questionDescription, String imgSrc, String dateTime, String status, String topic,
			String title, List<Answer> answers, String questionCreatedBy, String questionApprovedBy) {
		super();
		this.id = id;
		this.questionDescription = questionDescription;
		this.imgSrc = imgSrc;
		this.dateTime = dateTime;
		this.status = status;
		this.topic = topic;
		this.title = title;
		this.answers = answers;
		this.questionCreatedBy = questionCreatedBy;
		this.questionApprovedBy = questionApprovedBy;
	}


	@Override
	public String toString() {
		return "Question [id=" + id + ", questionDescription=" + questionDescription + ", imgSrc=" + imgSrc
				+ ", dateTime=" + dateTime + ", status=" + status + ", topic=" + topic + ", title=" + title
				+ ", answers=" + answers + ", questionCreatedBy=" + questionCreatedBy + ", questionApprovedBy="
				+ questionApprovedBy + "]";
	}
	
	

}

