package com.hcl.doconnectchatbot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.doconnectchatbot.entity.Message;

@Repository
public interface IMessageRepo extends JpaRepository<Message, Integer> {

}
