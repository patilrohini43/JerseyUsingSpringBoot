package com.bridgelabz.userApplication.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.bridgelabz.userApplication.dto.UserDto;
import com.bridgelabz.userApplication.model.User;
import com.bridgelabz.userApplication.repository.UserRepository;
import com.bridgelabz.userApplication.utility.Response;
import com.bridgelabz.userApplication.utility.Utility;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserRepository userRepository;
	
	 @Autowired
	 private ModelMapper modelMapper;
	 
	 @Autowired
		private Environment environment;

	@Override
	public Response register(UserDto userDto) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		User userExist=userRepository.findByEmail(userDto.getEmail());
	
	
		  User user=modelMapper.map(userDto, User.class);
		  userRepository.save(user);
		  Response response=Utility.statusResponse(200, "Register Successfully");
		  return response;

	}
	
	
	
	
	

}
