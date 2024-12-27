package com.collectionofentit.Entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {

	public static void main(String[] args) {
		
		User1 inst1 = new User1("Veena");
		Address ad1 = new Address();
		ad1.setCity("banglore");
		ad1.setState("karnataka");
		
		inst1.getAddress().add(ad1);
		
		Address ad2 = new Address();
		ad2.setCity("tarikere");
		ad2.setState("Andhra");
		
		inst1.getAddress().add(ad2);
		
		Transaction t1 = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			
			t1 = session.beginTransaction();
			session.save(inst1);
			t1.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(t1 != null)
			{
				t1.rollback();
			}
		}

	}

}
