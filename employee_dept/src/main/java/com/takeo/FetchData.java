package com.takeo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.Department;
import com.takeo.pojo.Employee;
import com.takeo.util.SessionUtil;

public class FetchData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Session ses =null;
		Transaction tx = null;
		try
		{
			ses = new Configuration().configure("com\\takeo\\config\\hibernate.cfg.xml").buildSessionFactory().openSession();
			Query query = ses.createQuery("from Department");
			List<Department> dept_list = query.getResultList();
			for(Department dep : dept_list)
			{
				List<Employee> emp = dep.getElist();
				System.out.println(dep.getDno() + "\t"+ dep.getDpname()+ "\t" + dep.getLocation());
				System.out.println("Printing the Employee name belonging to the same department: ");
				for(Employee em: emp)
				{
					System.out.println(em.getDept()+"\t" + em.getEid()+"\t"+ em.getEmail()+ "\t"+ em.getEname());
				}
			}
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
