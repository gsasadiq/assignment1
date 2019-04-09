package com.evry.assignment1.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.evry.assignment1.dto.Employee;

public class UpdateDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("employee").createEntityManager();
		Employee employeeDTO = entityManager.find(Employee.class, 1);
		entityManager.getTransaction().begin();
		employeeDTO.seteName("Sadiq");
		entityManager.getTransaction().commit();
	}

}
