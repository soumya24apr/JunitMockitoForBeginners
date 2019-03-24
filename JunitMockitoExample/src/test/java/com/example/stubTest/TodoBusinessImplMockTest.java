package com.example.stubTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;
import com.data.business.TodoBusinessImpl;
import com.data.stub.TodoServiceStub;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetriveTodosRelatedToSpring_usingAMock(){
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("SpringMVC","SpringBoot","JunitMockito");
		when(todoServiceMock.retriveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetriveTodosRelatedToSpring_usingAMockEmpty(){
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retriveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
		assertEquals(0, filteredTodos.size());
	}

}
