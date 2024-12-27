package com.detachtopersist.utitlity;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
    public static StandardServiceRegistry ssr;
    public static SessionFactory factory;
    
    public static SessionFactory getSessionFactory() {
    	
    	try {
			
    		ssr = new StandardServiceRegistryBuilder().configure().build();
    		
    		MetadataSources src = new MetadataSources(ssr);
    		Metadata data = src.getMetadataBuilder().build();
    		
    		factory = data.getSessionFactoryBuilder().build();
		} catch (Exception e) {
			e.printStackTrace();
			if(ssr != null) {
				StandardServiceRegistryBuilder.destroy(ssr);
			}
		}
    
    	 return factory;
    }
    
    public static void shtdown()
    {
    	if(ssr != null)
    		StandardServiceRegistryBuilder.destroy(ssr);
    }

}
