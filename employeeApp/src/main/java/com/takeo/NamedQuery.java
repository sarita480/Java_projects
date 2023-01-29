package com.takeo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.Employee;

public class NamedQuery 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
	      
	      System.out.println(cfg.getProperty("hibernate.conneciton.driver_class"));
	      cfg.configure("com\\takeo\\config\\hibernate.cfg.xml");
	      SessionFactory  factory = cfg.buildSessionFactory();
	      Session ses = factory.openSession();
	      Transaction tx = ses.beginTransaction();
	      //Named hql/dynamic queries to find all records
	      System.out.println("Hello");
	      Query q = ses.getNamedQuery("find_all");
	      List<Employee> records = q.getResultList();
	   //   records.forEach(c->System.out.println(c.getEid()+ "\t" + c.getEname()+ "\t"+ c.getEmail()+ "\t" +
	    //  c.getEadd()));
	      for(Employee em: records)
	      {
	    	  System.out.println(em.getEid()+ "\t" + em.getEname()+ "\t"+ em.getEmail()+ "\t" +em.getEadd());
	      }
	}

}
