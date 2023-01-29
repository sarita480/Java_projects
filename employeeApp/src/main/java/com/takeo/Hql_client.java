package com.takeo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.Employee;

public class Hql_client {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	//System.out.println( "Hello World!" );
      Configuration cfg = new Configuration();
      
      System.out.println(cfg.getProperty("hibernate.conneciton.driver_class"));
      cfg.configure("com\\takeo\\config\\hibernate.cfg.xml");
      SessionFactory  factory = cfg.buildSessionFactory();
      Session ses = factory.openSession();
      Transaction tx = ses.beginTransaction();
      //bulk operations. fetching more than one row
//      Query q = ses.createQuery("from Employee");
//      List<Employee>records = q.getResultList();
//      records.stream().forEach(c->System.out.println(c.getEid() +"\t" +  c.getEmail() +"\t" +  c.getEname() +"\t"+  c.getEadd()));
//      
      //working with parameter binding by name, using where clause, ? is deprecate and is called position parameter.
      Query q = ses.createQuery("from Employee where id >:i");
      q.setParameter("i", 1);
      List<Employee> records = q.getResultList();
     records.stream().forEach(c->System.out.println(c.getEid() +"\t" + c.getEmail()+ "\t" + c.getEname()+ "\t"+ c.getEadd()));

	}

}
