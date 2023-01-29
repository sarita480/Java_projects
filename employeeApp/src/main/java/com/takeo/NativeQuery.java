package com.takeo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class NativeQuery {

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
	     // System.out.println("Hello");
//	      org.hibernate.query.NativeQuery q = ses.createSQLQuery("select id, ename,email,eadd from Employee");
//	      List<Object[]> records = q.getResultList();
//	      for(Object obj[]:records)
//	      {
//	    	  System.out.println(obj[0]+ "\t"+ obj[1]+"\t" +  obj[2] + "\t" + obj[3]);
//	      }
//	      Query q = ses.createQuery("update Employee set lname:name where eid=:id");
//	      q.setParameter("name", "Shiva");
//	      q.setParameter("id", 1);
//	      int c = q.executeUpdate();
//	      System.out.println("Updated Successfully." + c);
//	      tx.commit();
	      //bulk row operation.Dynamic native sql query.
	      //org.hibernate.query.NativeQuery q = ses.createNativeQuery("select * from employee");
	     // Entity query mapped with Entity class name.
//	      q.addEntity(Employee.class);
//	      List<Employee>records = q.getResultList();
//	      
//	      for(Employee emp : records)
//	      {
//	    	  System.out.println(emp.getEid() +"\t" +  emp.getEname()+ "\t"+ emp.getEmail()+"\t" +  emp.getEadd());
//	      }
//	      
//	      org.hibernate.query.NativeQuery q = ses.createSQLQuery("select ename, eadd from employee");
//	      q.addScalar("ename");
//	      q.addScalar("eadd");
//	      System.out.println("Hello");
//	      List<Object[]> records = q.getResultList();
//	      for(Object obj[]:records)
//	      {
//	    	  System.out.println(obj[0]+ "\t"+ obj[1]);
//	      }
	      //Insertion
	      
	      org.hibernate.query.NativeQuery q = ses.createSQLQuery("insert into employee values(:id, :ename, :email, :eadd)");
	      q.setParameter("id", 5);
	      q.setParameter("ename", "Elan");
	      q.setParameter("email", "elan@gmail");
	      q.setParameter("eadd", "Melrose, MA");
	      int count = q.executeUpdate();
	      System.out.println("Updated Successfully: " + count);
	      tx.commit();
	      
	      
	      

	}

}
