package com.onetoone.bidirectional.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetoone.bidirectional.entity.Instructer_detail;
import com.onetoone.bidirectional.utility.HibernateUtil;

public class InstructerDetailDao {
	
	public void SaveInstrcterDetail(Instructer_detail det1)
	{
		Transaction trans = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		
		try {
			trans = s1.beginTransaction();
			s1.save(det1);
			trans.commit();
		} catch (Exception e) {
			if(trans != null)
				trans.rollback();
		}
	}
	
	public Instructer_detail getInstrcterDetail(int id)
	{
		Transaction trans = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		Instructer_detail det1 = null;
		
		try {
			trans = s1.beginTransaction();
			det1 = s1.get(Instructer_detail.class, id);
			trans.commit();
		} catch (Exception e) {
			if(trans != null)
				trans.rollback();
		}
		
		return det1;
	}
	
	public void DeleteInstrcterDetail(int id)
	{
		Transaction trans = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		Instructer_detail det1 = null;
		
		try {
			trans = s1.beginTransaction();
			det1 = s1.get(Instructer_detail.class, id);
			s1.delete(det1);
			trans.commit();
		} catch (Exception e) {
			if(trans != null)
				trans.rollback();
		}
		
	}

}
