package com.hcl.doconnectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.doconnectapp.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
