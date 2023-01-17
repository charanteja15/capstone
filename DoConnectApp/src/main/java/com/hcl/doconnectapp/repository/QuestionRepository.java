package com.hcl.doconnectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.doconnectapp.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> 
{
	public Question findByTopic(String topic);
}

