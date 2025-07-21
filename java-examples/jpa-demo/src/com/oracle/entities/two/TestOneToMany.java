package com.oracle.entities.two;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestOneToMany {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("jpa-demo");
		// get the connection
		EntityManager manager = factory.createEntityManager();
//
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		Student student = manager.find(Student.class, 1);
//		Mark mark = new Mark();
//		mark.setStudent(student);
//		mark.setPhysics(50);
//		mark.setChemistry(60);
//		mark.setMaths(70);
//		manager.persist(mark);
//		transaction.commit();
//		
		Student studentDetail = manager.find(Student.class, 1);
		System.out.println(studentDetail);
		manager.close();
		factory.close();
		System.out.println("DONE");
	}
}
