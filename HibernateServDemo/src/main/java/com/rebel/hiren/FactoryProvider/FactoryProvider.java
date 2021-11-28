package com.rebel.hiren.FactoryProvider;

import com.rebel.hiren.Beans.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/*
 *  this is the singleton class which provides SessionFactory object
 */
public class FactoryProvider
{
	private static SessionFactory factory;
	
	private FactoryProvider()
	{}
	
	public static SessionFactory getFactory()
	{
		try {
			
			if(factory == null)
			{
				Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
				factory = con.buildSessionFactory();
			}
			
		} catch (Exception e) {
			System.out.println("smtng wrng with factory provider");
		}
		
		
		return factory;
	}

}
