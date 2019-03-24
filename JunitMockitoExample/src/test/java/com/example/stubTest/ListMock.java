package com.example.stubTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.*;

import java.util.List;

import org.junit.Test;

public class ListMock {

	@Test
	public void testListSizeMethod(){
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
	}
	
	@Test
	public void testListSizeMultipleMethod(){
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
	}
	
	@Test
	public void testListSizeGetMethod(){
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("hello world");
		assertEquals("hello world",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	
	@Test
	public void testListSizeAnyIntMethod(){
		List listMock = mock(List.class);
		
		//argument matcher
		when(listMock.get(anyInt())).thenReturn("hello world");
		
		assertEquals("hello world",listMock.get(0));
		assertEquals("hello world",listMock.get(1));
	}
	
	@Test(expected = RuntimeException.class)
	public void testMockList_throwAnException(){
		List listMock = mock(List.class);
		
		//argument matcher
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("something"));
		
		assertEquals("hello world",listMock.get(0));
		assertEquals("hello world",listMock.get(1));
	}
}
