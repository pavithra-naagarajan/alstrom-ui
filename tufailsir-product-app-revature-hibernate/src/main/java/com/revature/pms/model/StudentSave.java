package com.revature.pms.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.pms.util.HibernateUtil;

public class StudentSave {
	public static void main(String[] args) 
	 {
	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  session.beginTransaction();
	  
	  Student student =new Student("ajay","raj","ajay@a.com"); 
	 session.save(student);
	 System.out.println("student saved");
	
	 
	  session.getTransaction().commit();
	  session.close();
}
}