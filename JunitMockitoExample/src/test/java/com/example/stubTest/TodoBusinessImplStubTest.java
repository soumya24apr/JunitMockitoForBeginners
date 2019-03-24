package com.example.stubTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;
import com.data.business.TodoBusinessImpl;
import com.data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetriveTodosRelatedToSpring_usingAStub(){
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetriveTodosRelatedToSpring_usingAStub2(){
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
		assertEquals(0, filteredTodos.size());
	}
}
