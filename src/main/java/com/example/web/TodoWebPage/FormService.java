package com.example.web.TodoWebPage;

import org.springframework.stereotype.Service;

@Service
public class FormService {

	public boolean isValid(String name, String password) {
		boolean isUserName = name.equalsIgnoreCase("Kavitha");
		boolean isPassword = password.equals("password");
		return isUserName && isPassword;
	}
}
