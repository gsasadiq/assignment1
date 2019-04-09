package com.evry.assignment1.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.evry.assignment1.dto.Employee;

public class GetDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("employee").createEntityManager();
		Employee employee=entityManager.find(Employee.class, 5);
		
		System.out.println(employee.geteId()+" "+employee.geteName()+" "+employee.getDepartment().getdName());

		

	}

}
