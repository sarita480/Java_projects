package com.takeo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.takeo.pojo.Department;
import com.takeo.pojo.Employee;
import com.takeo.util.SessionUtil;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Session ses = null;
    	Transaction tx = null;
    	try
    	{
    		
    		 ses = SessionUtil.getSession();
    		 
    		 tx = ses.beginTransaction();
    		 Employee em = new Employee();
    		 
    		 em.setEmail("sarita@gmail");
    		 em.setEname("Sarita");
    		 ArrayList<Employee> emlist = new ArrayList<Employee>();
    		 Employee e1 = new Employee();
    		 
    		 e1.setEmail("safala@gmail");
    		 e1.setEname("Safala");
    		 emlist.add(em);
    		 emlist.add(e1);
    		 
    		 Department d = new Department();
    		 d.setDpname("Compmuter Science");
    		 d.setLocation("Ames, Iowa");
    		 d.setElist(emlist);
    		 System.out.println("Print Employe and departname: ");
    		 for(int i = 0; i<emlist.size(); i++)
    		 {
    			System.out.println(emlist.get(i).getEname() + "\t" + emlist.get(i).getEmail()+ "\t" + emlist.get(i).getDept() +"\t" + emlist.get(i).getEid()); 
    		 }
    		 
    		 
    		 ses.save(d);
    		 tx.commit();
    		 
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		SessionUtil.closeSession(ses);
    	}
    
      
    }
}
