package com.evry.assignment1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.evry.assignment1.dto.Department;
import com.evry.assignment1.dto.Employee;

public class EmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department departmentDTO = new Department();
		departmentDTO.setdName("IT");
		
		Employee employeeDTO = new Employee();
		employeeDTO.seteName("Gsa");
		employeeDTO.setDepartment(departmentDTO);
		List<Employee> list = new ArrayList<>();
		departmentDTO.setEmployee(list);
		
		list.add(employeeDTO);
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("employee").createEntityManager();
		
		//entityManager.getTransaction();
		//EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.getTransaction().begin();
		entityManager.persist(employeeDTO);
		entityManager.getTransaction().commit();
		
	}

}
