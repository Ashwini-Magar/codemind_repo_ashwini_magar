package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        System.out.println( "PROJECT STARTED..." );
       
 Student st=new Student();
 st.setRollno(102);
 st.setEmail("ashwinimagar@gmail.com");
 st.setName("Ashwini_Magar");
 System.out.println( st);
 Session session =sessionFactory.openSession();
Transaction transaction= session.beginTransaction();
session.save(st);
 transaction.commit();
 session.close();
 System.out.println("data inserted");
    }
}

