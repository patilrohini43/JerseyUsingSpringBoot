package com.bridgelabz.userApplication.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.userApplication.dto.UserDto;
import com.bridgelabz.userApplication.utility.Response;

@Service
public interface UserService {
	
	public Response register(UserDto userdto);

}
