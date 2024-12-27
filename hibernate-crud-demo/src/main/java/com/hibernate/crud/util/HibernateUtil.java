package com.hibernate.crud.util;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionfact;
	private static StandardServiceRegistry registr;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionfact==null)
		{
			registr = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources sources = new MetadataSources(registr);
			
			Metadata metadata=sources.getMetadataBuilder().build();
			
			sessionfact=metadata.getSessionFactoryBuilder().build();
		}
		
		return sessionfact;
	}
}
