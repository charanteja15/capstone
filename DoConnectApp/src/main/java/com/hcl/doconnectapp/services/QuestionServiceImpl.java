package com.hcl.doconnectapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.doconnectapp.entity.Question;
import com.hcl.doconnectapp.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public String addQuestion(Question question) {
		// TODO Auto-generated method stub
		questionRepository.save(question);
		return "Question added successfully..!";
	}

	@Override
	public String updateQuestion(Question question) {
		// TODO Auto-generated method stub
		questionRepository.save(question);
		return "Question updated successfully..1";
	}

	@Override
	public String deleteQuestionById(long id) {
		// TODO Auto-generated method stub
		questionRepository.deleteById(id);
		return "Question is deleted..!";
	}

	@Override
	public Question getQuestionById(long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElse(null);
	}

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionByTopic(String topic) {
		// TODO Auto-generated method stub
		return questionRepository.findByTopic(topic);
	}

}

