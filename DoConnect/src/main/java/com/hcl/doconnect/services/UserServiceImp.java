package com.hcl.doconnect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.doconnect.repositories.IUserRepository;

@Service
public class UserServiceImp
{
	@Autowired
	IUserRepository userRepo;

}
