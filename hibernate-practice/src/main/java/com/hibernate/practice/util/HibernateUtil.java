package com.hibernate.practice.util;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {

	private static StandardServiceRegistry registry;
	
	private static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionfactory == null)
		{
			try {
				
				registry = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources sources = new MetadataSources(registry);
				
				Metadata metadata=sources.getMetadataBuilder().build();
				
				sessionfactory = metadata.getSessionFactoryBuilder().build();
				
			}catch(Exception e) {
				
				e.printStackTrace();
				if(registry != null)
					StandardServiceRegistryBuilder.destroy(registry);
			}
		}
		
		return sessionfactory;
	}
}
