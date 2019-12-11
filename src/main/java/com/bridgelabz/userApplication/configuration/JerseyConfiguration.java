package com.bridgelabz.userApplication.configuration;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.bridgelabz.userApplication.controller.UserController;


@Component
@ApplicationPath("/userapp")
public class JerseyConfiguration extends ResourceConfig
{
	 public JerseyConfiguration() {
		  register(UserController.class);
		 }
}
