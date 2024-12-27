package com.cascadetpes.Util;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory()
	{
	if(factory == null)
	{
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources Sources= new MetadataSources(registry);
		
		Metadata metadata= Sources.getMetadataBuilder().build();
		
		factory = metadata.getSessionFactoryBuilder().build();
	}
	
	return factory; 
	}

}
