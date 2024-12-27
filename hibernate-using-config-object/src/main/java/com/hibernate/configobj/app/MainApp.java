package com.hibernate.configobj.app;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.configobj.model.Student;
import com.hibernate.configobj.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
	  Student s1 = new Student("gac", "ggg@email.com");
	  Transaction trans= null;

	  try(Session session = HibernateUtil.getSessionFactory().openSession() ) {
		
		  trans=session.beginTransaction();
		  
		  session.save(s1);
		  
		  trans.commit();
		  
		  
	} catch (Exception e) {
          e.printStackTrace();
          
          if(trans != null)
        	  trans.rollback();
	}
	  
	}

}
