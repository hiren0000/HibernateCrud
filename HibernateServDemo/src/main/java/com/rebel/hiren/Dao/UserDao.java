package com.rebel.hiren.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.rebel.hiren.Beans.User;
import com.rebel.hiren.FactoryProvider.FactoryProvider;

public class UserDao
{
	
	// Saving object to the database
	public void saveUser(User user)
	{
		try {
			SessionFactory sf = FactoryProvider.getFactory();
			Session se = sf.openSession();
			Transaction tx = se.beginTransaction();
			
			se.save(user);
			
			tx.commit();
			se.close();
			
		} catch (Exception e) {
			System.out.println("sm prb with saving the data into DB ):");
		}
	}
	
	// Fetching all the users
	public List<User> getAllUsers()
	{
		List<User> list =null;
		
		try {
			SessionFactory sf = FactoryProvider.getFactory();
			Session se = sf.openSession();
			Transaction tx = se.beginTransaction();
			
		    Query<User> qu = se.createQuery("from User");
		    list = qu.list();
			
			tx.commit();
			se.close();
			
			
		} catch (Exception e) {
			System.out.println("sm prb with fetching all usrs ):");
		}
		
		return list;
	}

}
