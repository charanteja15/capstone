package com.hcl.doconnectapp.services;

import java.util.List;

import com.hcl.doconnectapp.entity.Question;

public interface IQuestionService {

	public String addQuestion(Question question);

	public String updateQuestion(Question question);

	public String deleteQuestionById(long id);

	public Question getQuestionById(long id);

	public List<Question> getAllQuestions();

	public Question getQuestionByTopic(String topic);

}