package com.hcl.doconnectapp.restcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hcl.doconnectapp.entity.Answer;
import com.hcl.doconnectapp.entity.Question;
import com.hcl.doconnectapp.entity.User;
import com.hcl.doconnectapp.exception.UserNotFoundException;
import com.hcl.doconnectapp.services.IAnswerService;
import com.hcl.doconnectapp.services.IQuestionService;
import com.hcl.doconnectapp.services.IUserService;
import com.hcl.doconnectapp.utility.Message;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
	
	@Autowired
	IUserService userService;
	
	@Autowired
	IAnswerService answerSerivce;
	
	@Autowired
	IQuestionService questionService;
	
	//User Register
	@PostMapping("/register")
	public ResponseEntity<String> userRegister(@RequestBody  User user){
		return userService.userRegistration(user);
	}
	
	//User Login
	@PostMapping("/userLogin")
	public String userLogin(@RequestBody User user) throws UserNotFoundException{
		return userService.userLogin(user);
	}
	
	
	//User Logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		String msg = "Still login";
		
		if (session.getAttribute("userName") == null) {
			msg = "Logout";
		}
		return msg;
	}
	
	//Add Answer
	@PostMapping("/addAnswer")
	public String addAnswer(@RequestBody Answer answer) {
		return answerSerivce.addAnswer(answer);
	}
	
	
	//Update Answer
	@PutMapping("/updateAnswer")
	public String updateAnswer(@RequestBody Answer answer) {
		return answerSerivce.updateAnswer(answer);
	}
	
	//Delete Answer
	@DeleteMapping("/deleteAnswer")
	public String deleteAnswer(@PathVariable long id) {
		return answerSerivce.deleteAnswerById(id);
	}
	
	//Get Answer By entering the Id
	@GetMapping("/getAnswerById")
	public Answer getAnswerById(@PathVariable long id) {
		return answerSerivce.getAnswerById(id);
	}
	
	//Get the All Answers
	@GetMapping("/getAllAnswers")
	public List<Answer> getAllAnswers(){
		return answerSerivce.getAllAnswers();
	}
	
	//Add Question
	@PostMapping("/addQuestion")
	public String addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
	
	//Update the Question
	@PutMapping("/updateQuestion")
	public String updateQuestion(@RequestBody Question question) {
		return questionService.updateQuestion(question);
	}
	
	//Delete the Question by id
	@DeleteMapping("deleteQuestionById")
	public String deleteQuestionById(@PathVariable long id) {
		return questionService.deleteQuestionById(id);
	}
	
	//Get the Question By entering the id
	@GetMapping("/getQuestionByid")
	public Question getQuestionById(@PathVariable long id) {
		return questionService.getQuestionById(id);
	}
	
	//Get the All Questions
	@GetMapping("/getAllQuestions")
	public List<Question> getAllQuestions(){
		return questionService.getAllQuestions();
	}
	
	//To get the topic
	@GetMapping("/getTopic")
	public Question getQuestionByTopic(@PathVariable String topic) {
		return questionService.getQuestionByTopic(topic);
	}
	
	@PostMapping("/sendMessage")
	public Message sendMessage( @RequestBody Message message)  throws JsonProcessingException{
		return userService.sendMessage(message);
	}

}
