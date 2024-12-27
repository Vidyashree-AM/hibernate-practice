package com.collectionofentit.Entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	public static StandardServiceRegistry ssr = null;
	public static SessionFactory factory = null;
	
	public static SessionFactory getSessionFactory()
	{
	  try {
			System.out.println("hello");
		    ssr = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources src = new MetadataSources(ssr);
			
			Metadata data = src.getMetadataBuilder().build();
			factory = data.getSessionFactoryBuilder().build();
			
			System.out.println("hello1");
			
		} catch (Exception e) {
			e.printStackTrace();
			if(ssr != null)
			{
				StandardServiceRegistryBuilder.destroy(ssr);
			}
		}
		
		return factory;
	}
	
}
