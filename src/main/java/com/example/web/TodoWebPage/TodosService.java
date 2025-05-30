package com.example.web.TodoWebPage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

@Service
public class TodosService {
	

	public static List<Todos> todos = new ArrayList<>();
	private static int todosCount = 0;
	
	static {
		todos.add(new Todos(++todosCount, "Kavitha", "Complete Java Course 1", LocalDate.now().plusMonths(6)));
		todos.add(new Todos(++todosCount, "Kavitha", "Complete Spring Boot Course 2", LocalDate.now().plusYears(1)));
		todos.add(new Todos(++todosCount, "Kavitha", "Complete Web Development Course 3", LocalDate.now().plusYears(1)));
	}
	
	
	public List<Todos> findByName(String activity){
		return todos;
	}
	
	public void addUser(String activity, String description, LocalDate date) {
		Todos todo = new Todos(++todosCount, activity, description, date);
		todos.add(todo);
	}
	
	public void deleteUser(int id) {
		todos.removeIf(todo->id==todo.getId());
	}
	
	public Todos findTodo(int id) {
		Predicate<? super Todos> predicate = todo->todo.getId()==id;
		Todos todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
	
	public String updateTodo(@Valid Todos todo) {
		deleteUser(todo.getId());
		todos.add(todo);
		return "redirect:todos";
	}
	
	
	
	
	
	
}
