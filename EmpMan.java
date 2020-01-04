package com.deloitte.emp;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMan{
	public static void main(String args[]) {
		
		try {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Employee e = new Employee(1,"liya",1200);
		Session ssn = sf.openSession();
		Transaction tx = ssn.beginTransaction();

		ssn.save(e);
		tx.commit();
		ssn.close();
		}
		catch(Exception e)
		{
			System.out.println(e+"error");
		}

	}
}
