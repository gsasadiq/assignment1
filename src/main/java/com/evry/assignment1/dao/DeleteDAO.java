package com.evry.assignment1.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.evry.assignment1.dto.Employee;

public class DeleteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager entityManager = Persistence.createEntityManagerFactory("employee").createEntityManager();
		
		Employee employee = entityManager.find(Employee.class, 3);
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		
	}

}
