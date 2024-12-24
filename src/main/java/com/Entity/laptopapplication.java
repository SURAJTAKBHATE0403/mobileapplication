package com.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 class laptopapplication {
	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(laptop.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println(1);
		Session session = sessionFactory.openSession();
		laptop ll=new laptop(2,"hp",5800);
		session.save(ll);
		session.beginTransaction().commit();
		
		
		
	}
}
