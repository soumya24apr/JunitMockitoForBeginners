package com.data.business;

import java.util.ArrayList;
import java.util.List;

import com.data.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retriveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();

		List<String> todos = todoService.retriveTodos(user);
		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
