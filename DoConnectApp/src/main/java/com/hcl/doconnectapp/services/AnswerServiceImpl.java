package com.hcl.doconnectapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.doconnectapp.entity.Answer;
import com.hcl.doconnectapp.repository.AnswerRepository;


@Service
public class AnswerServiceImpl implements IAnswerService {
	
	@Autowired
	AnswerRepository answerRepository;

	@Override
	public String addAnswer(Answer answer) {
		answerRepository.save(answer);
	
		return "Answer added successfully..!";
	}

	@Override
	public String updateAnswer(Answer answer) {
		// TODO Auto-generated method stub
		answerRepository.save(answer);
		return "Answer is updated sucessfully..!";
	}

	@Override
	public String deleteAnswerById(long id) {
		// TODO Auto-generated method stub
		answerRepository.deleteById(id);
		return "answer deleted sucessfully..!";
	}

	@Override
	public Answer getAnswerById(long id) {
		// TODO Auto-generated method stub
		
		return answerRepository.findById(id).orElse(null);
	}

	@Override
	public List<Answer> getAllAnswers() {
		// TODO Auto-generated method stub
		return answerRepository.findAll();
	}

}

