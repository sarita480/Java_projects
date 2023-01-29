package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Configuration cfg = new Configuration();
//        
//        System.out.println(cfg.getProperty("hibernate.conneciton.driver_class"));
//        cfg.configure("com\\takeo\\config\\hibernate.cfg.xml");
//        SessionFactory  factory = cfg.buildSessionFactory();
//        Session ses = factory.openSession();
//        Transaction tx = ses.beginTransaction();
//        Employee em = new Employee(1,"Faram","faram@takeo","Massachussetts");
//        ses.persist(em);
//        tx.commit();
    	
    	  Configuration cfg = new Configuration();
    	  
    	  System.out.println(cfg.getProperty("hibernate.conneciton.driver_class"));
    	  //Configure method reads the configurations details form configuration file
    	  cfg.configure("com\\takeo\\config\\hibernate.cfg.xml");
          System.out.println(cfg.getProperty("hibernate.conneciton.driver_class"));
          //session factory object creation
          SessionFactory factory = cfg.buildSessionFactory();
          //Session open/session object creation
          Session ses = factory.openSession();
          //Transaction are desabled by default.We need to open .Non-selective operations like insertion,deletion,updation . 
           
          Transaction tx = ses.beginTransaction();
          //single Row operations
          //Transient state
          Employee emp = new Employee(1, "Anna", "anna@email.com", "chennai");
          //Integer id = (Integer) ses.save(emp);//Persistent state, it will not be available in the database yet.
          // System.out.println(id + " This is the generated id.");
          ses.persist(emp);//return type is void
          tx.commit();
        
        
    }
}
