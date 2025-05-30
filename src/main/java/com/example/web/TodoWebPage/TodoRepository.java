package com.example.web.TodoWebPage;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todos, Integer>{
	public List<Todos> findByActivity(String activity);

	

}
