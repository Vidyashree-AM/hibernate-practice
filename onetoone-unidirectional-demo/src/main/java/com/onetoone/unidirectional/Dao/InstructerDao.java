package com.onetoone.unidirectional.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetone.uniderection.entity.Instructer;
import com.onetoone.unidirectional.utility.HibernateUtil;

public class InstructerDao {
	
	public void SaveInstructer(Instructer ins)
	{
		Transaction trans = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		
		try {
			
			trans = s1.beginTransaction();
			s1.save(ins);
			trans.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
	}
	
	public Instructer getInstructer(int id)
	{
		Transaction trans = null;
		Instructer ins = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		
		try {
			trans = s1.beginTransaction();
		    ins = s1.get(Instructer.class, id);
			trans.commit();
			
		} catch (Exception e) {
			if(trans != null)
				trans.rollback();
		}
		
		return ins;
	}
	
	public void deleteInstructer(int id)
	{
		Transaction trans = null;
		Instructer ins = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		
		try {
			trans = s1.beginTransaction();
			ins = s1.get(Instructer.class, id);
			
			s1.delete(ins);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if( trans != null)
				trans.rollback();
		}
	}
}
