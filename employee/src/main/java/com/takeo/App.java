package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.Employee;

public class App {
  public static void main(String[] args) 
  {
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
      Employee emp = new Employee(3, "Anna", "anna@email.com", "chennai");
      //Integer id = (Integer) ses.save(emp);//Persistent state, it will not be available in the database yet.
      // System.out.println(id + " This is the generated id.");
      ses.persist(emp);//return type is void
      tx.commit();
      System.out.println(ses.contains(emp));//true
      ses.evict(emp);
      System.out.println(ses.contains(emp));//false
     // tx.commit();//object Move to the database
      //To get the object from the session we can use evict method.
      //This is detached state, getting entity object from a session
     ses.close();
      
      
      
      
      
    
  }
}
