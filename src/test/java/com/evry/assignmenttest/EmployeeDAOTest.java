package com.evry.assignmenttest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import com.evry.assignment1.dto.Employee;

public class EmployeeDAOTest {
	
	
	private SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	@Test 
	void emplyoeeDao() {
		Session session = sf.openSession();
		Employee employeeDTO = session.get(Employee.class, 3);
		assertEquals(3,employeeDTO.geteId());
		assertEquals("Sadiq", employeeDTO.geteName());

	}

}
