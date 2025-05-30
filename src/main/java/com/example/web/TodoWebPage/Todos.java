package com.example.web.TodoWebPage;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity(name = "students")
public class Todos {

	@Id
	private int id;
	private String activity;
	
	@Size(min=3, message = "Enter minimum 3 characters")
	private String description;
	private LocalDate date;

	public Todos(int id, String activity, String description, LocalDate date) {
		this.id = id;
		this.activity = activity;
		this.description = description;
		this.date = date;
	}

	public Todos() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Todos [id=" + id + ", activity=" + activity + ", description=" + description + ", date=" + date + "]";
	}

}
