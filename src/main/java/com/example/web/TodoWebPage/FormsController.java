package com.example.web.TodoWebPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class FormsController {

	@Autowired
	private FormService formService;


	@GetMapping("forms")
	public String getForm() {
		return "loginform";
	}

	@PostMapping("forms")
	public String getDetails(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (formService.isValid(name, password)) {
			model.put("name", name);
			model.put("password", password);
			
			return "welcome";
		}
		model.put("Error", "Invalid UserName or Password");

		return "loginform";

	}
}
