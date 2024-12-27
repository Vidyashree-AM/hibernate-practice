package com.hibernate.configobj.util;

import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.hibernate.configobj.model.Student;

public class HibernateUtil {
	
	private static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionfactory == null)
		{
			Configuration config = new Configuration();
			Properties  settings = new Properties();
			
			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/jdbc_demo?useSSL=false");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "vidya123");
			
			config.setProperties(settings);
			config.addAnnotatedClass(Student.class);
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		    sessionfactory = config.buildSessionFactory(registry);
		    
		}
		
		 return sessionfactory;
	}

}
