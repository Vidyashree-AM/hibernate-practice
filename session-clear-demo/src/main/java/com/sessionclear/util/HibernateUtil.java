package com.sessionclear.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	public static StandardServiceRegistry ssr;
	public static SessionFactory factor;
	
	public static SessionFactory getSessionFactory()
	{
		try {
			
			ssr = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources sources = new MetadataSources(ssr);
			
			Metadata meta = sources.getMetadataBuilder().build();
			
			factor = meta.getSessionFactoryBuilder().build();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(ssr != null)
				StandardServiceRegistryBuilder.destroy(ssr);
		}
		
		return factor;
	}

	  public static void shtdown()
	    {
	    	if(ssr != null)
	    		StandardServiceRegistryBuilder.destroy(ssr);
	    }

	
}
