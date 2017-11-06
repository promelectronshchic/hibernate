package com.emt.controls.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	try {
	    	Session session = sessionFactory.openSession();
	    	try {
		    	Role role = new Role();
	    		
		    	User user = new User();
		    	user.setAge(29);
		    	user.setFirstname("Dmitrij");
		    	user.setLastname("Kulinich");
		    	user.setRole(role);
		    	
		    	role.setTitle("admin");
		    	Set<User> usersSet = new HashSet<>();
		    	usersSet.add(user);
		    	role.setUsers(usersSet);

		    	TaxCard taxCard = new TaxCard();
		    	taxCard.setUser(user);
		    	taxCard.setIdentifier(new byte[] {1,2,3,4,5});
		    	user.setTaxCard(taxCard);
		    	
		    	
		    	try {
			    	session.beginTransaction();
			    	session.save(taxCard);
			    	session.save(role);
			    	session.save(user);
			    	session.getTransaction().commit();
		    	} catch (HibernateException e) {
		    		session.getTransaction().rollback();
		    	}
	    	} finally {
	    		session.close();
	    	}
    	} finally {
    		sessionFactory.close();
    	}
    	
    	System.out.println("Session factory was created!");
    }
}
