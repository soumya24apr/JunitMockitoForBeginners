package com.data.stub;

import java.util.Arrays;
import java.util.List;

import com.data.api.TodoService;

public class TodoServiceStub implements TodoService {

	@Override
	public List<String> retriveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("SpringMVC","SpringBoot","JunitMockito");
	}
}
