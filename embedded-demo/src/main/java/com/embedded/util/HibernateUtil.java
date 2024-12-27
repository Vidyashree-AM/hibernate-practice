package com.embedded.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionfactory;
	private static StandardServiceRegistry registr;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionfactory == null)
		{
			registr = new StandardServiceRegistryBuilder().configure().build();
			
			MetadataSources sorces= new MetadataSources(registr);
			Metadata metadata= sorces.getMetadataBuilder().build();
			
			sessionfactory = metadata.getSessionFactoryBuilder().build();
		}
		
		return sessionfactory;
	}
	

}
