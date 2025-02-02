package com.hibernate.practice.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.practice.model.Student;
import com.hibernate.practice.util.HibernateUtil;

public class MainApp {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("deepa", "ddd@gmail.com");
		Transaction trans = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			trans=session.beginTransaction();
			
			session.save(s1);
			
			trans.commit();
		}catch(Exception e) {
			if(trans != null)
				trans.rollback();
		}
	}

}
