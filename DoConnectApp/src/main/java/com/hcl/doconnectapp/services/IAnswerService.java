package com.hcl.doconnectapp.services;

import java.util.List;

import com.hcl.doconnectapp.entity.Answer;

public interface IAnswerService {

	public String addAnswer(Answer answer);

	public String updateAnswer(Answer answer);

	public String deleteAnswerById(long id);

	public Answer getAnswerById(long id);

	public List<Answer> getAllAnswers();
}
