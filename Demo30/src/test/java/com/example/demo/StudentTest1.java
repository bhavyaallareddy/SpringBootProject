package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest1 {
	@Test
	void testStudentDetails() {
	        Student1 student = new Student1();
	        student.setName("Bhavya");
	        student.setAge(22);
	        student.setSalary(28000.0);
	 
	        assertEquals("Bhavya", student.getName());
	        assertEquals(22, student.getAge());
	        assertEquals(28000.0, student.getSalary(), 0.001);
	    }
}
