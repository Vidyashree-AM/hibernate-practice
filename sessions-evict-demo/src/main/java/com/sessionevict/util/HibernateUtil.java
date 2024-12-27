package com.sessionevict.util;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static StandardServiceRegistry registr;
	private static SessionFactory factor;
	
	public static SessionFactory getSessionFactory()
	{
		if(factor == null)
		{
			registr =  new StandardServiceRegistryBuilder().configure().build();
			MetadataSources src =  new MetadataSources(registr);
			
			Metadata data = src.getMetadataBuilder().build();
			factor = data.getSessionFactoryBuilder().build();
		}
		return factor;
	}
}
