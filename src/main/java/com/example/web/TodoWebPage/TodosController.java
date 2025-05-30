package com.example.web.TodoWebPage;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//@Controller
@SessionAttributes("name")
public class TodosController {

	public TodosController (TodosService service) {
		this.service=service;
	}
	
	private TodosService service;

	@GetMapping("todos")
	public String findByName(ModelMap model) {
		List<Todos> todo = service.findByName("Java");
		model.addAttribute("todo", todo);
		return "todos";
	}

	@GetMapping("add-todo")
	public String showTodo(ModelMap model) {
		String activity = (String) model.get("name"); 
		Todos todo = new Todos(0, activity, "", LocalDate.now().plusMonths(6)); 
		model.put("todo", todo);
		return "addTodo";
	}

	@PostMapping("add-todo")
	public String addTodo(@ModelAttribute("todo") @Valid Todos todo, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "addTodo";
		}
		String activity = (String)model.get("name");
		service.addUser(activity, todo.getDescription(), todo.getDate());
		model.put("todo", todo);
		return "redirect:todos";
		
	}
	
	@RequestMapping(value = "delete")
	public String deleteTodo(@RequestParam int id) {
		service.deleteUser(id);
		return "redirect:todos";
	}
	
	@GetMapping("update-todo")
	public String showUpdateTodo(@RequestParam int id, ModelMap model) {
		Todos todo = service.findTodo(id);
		model.addAttribute("todo", todo);
		return "addTodo";
	}
	
	@PostMapping("update-todo")
	public String updateTodo(@ModelAttribute("todo") @Valid Todos todo, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "addTodo";
		}
		service.updateTodo(todo);
		model.put("todo", todo);
		return "redirect:todos";
	}
	
}





