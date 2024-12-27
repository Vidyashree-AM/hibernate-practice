package com.hibernate.crud.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.crud.model.Student;
import com.hibernate.crud.util.HibernateUtil;

public class StudentDao {
	
	public void saveStudent(Student student)
	{
		Transaction trans = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			trans = session.beginTransaction();
			session.save(student);
			
			trans.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
	}
	
	public void UpdateStudent(Student student)
	{
           Transaction trans =  null;
           
           try (Session session=HibernateUtil.getSessionFactory().openSession()){
			 trans = session.beginTransaction();
			 
			 session.saveOrUpdate(student);
			 
			 trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			if(trans != null)
				trans.rollback();
		}
	}
	
	public Student getStudentById(int id)
	{
		Transaction trans = null;
		Student s1 = null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
			trans=session.beginTransaction();
			
			s1=session.get(Student.class, id);
			trans.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
		return s1;
	}

	public List<Student> getAllStudent()
	{
           Transaction trans= null;
           List<Student> students = null;
           
           try(Session session=HibernateUtil.getSessionFactory().openSession()){
        	   trans=session.beginTransaction();
        	   
        	   students = session.createQuery("from Student").list();
        	   
        	   trans.commit();
        	   
		} catch (Exception e) {
			e.printStackTrace();
			
			if(trans != null)
				trans.rollback();
		}
		return students;       
	}
	
	public void deleteStudent(int id)
	{
		Transaction trans= null;
		Student s1=null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			
			trans= session.beginTransaction();
			s1=session.get(Student.class, id);
			session.delete(s1);
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
	}
}
