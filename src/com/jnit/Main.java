package com.jnit;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Product pr= new Product();
		pr.setPid(1048);
		pr.setPname("iphone");
		pr.setPrice(26100);
		
		Order or1 = new Order();
		or1.setOid(105);
		or1.setQuantity(4);
		or1.setLocation("Delhi");
		
		Order or2= new Order();
		or2.setOid(106);
		or2.setQuantity(2);
		or2.setLocation("Pune");
		
		Set s = new HashSet();
		s.add(or1);
		s.add(or2);
		
        pr.setRow(s);
		
		session.save(pr);
		
		transaction.commit();
		session.close();
	
	}

}
