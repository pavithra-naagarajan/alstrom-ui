package com.revature.pms.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.pms.util.HibernateUtil;

public class StudentNamedQueries {
	

		 public static void main(String[] args) 
		 {
		  
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query query = session.getNamedQuery("findStudentByName").setParameter("firstName", "ajay");
		  
		  @SuppressWarnings("deprecation")
		List <Student>students = query.list();
		  for(Student student : students)
		  {
		   System.out.println(student);
		  }
		  session.getTransaction().commit();
		  session.close();
		 }
		}


