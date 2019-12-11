package com.bridgelabz.userApplication.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.bridgelabz.userApplication.dto.UserDto;
import com.bridgelabz.userApplication.service.UserService;
import com.bridgelabz.userApplication.utility.Response;

@Component
@Path("/user")
public class UserController {
	
	
    @Autowired
	private UserService userService;
	
	
	 @POST
	 @Produces("application/json")
	 @Consumes("application/json")
	 @Path("/register")
	 @PostMapping("/register")
	 public ResponseEntity<Response> createUser(UserDto userDto) {
		 System.out.println(userDto.toString());
		Response response = userService.register(userDto);
		return  new ResponseEntity<Response>(response,HttpStatus.OK);
	 
	 }

}
