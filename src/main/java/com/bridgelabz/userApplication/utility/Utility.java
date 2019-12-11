package com.bridgelabz.userApplication.utility;


public class Utility {
	
	
	
	public static Response statusResponse(int statusCode,String statusMessage)
	{
	  Response response=new Response();
	  response.setStatusCode(statusCode);
	  response.setStatusMessage(statusMessage);
	 return response;
	}
	
	
}
