package com.hibernate.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Student std = new Student();
        std.setId(01);
        std.setName("Ahmad Abid");
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(std);
        tx.commit();
               
        session.close();
    }
}
