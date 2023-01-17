package com.hcl.doconnectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.doconnectapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	
	User findByUserName(String username);
	public User findByUserNameAndPassword(String userName, String userPassword);

}
