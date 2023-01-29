package com.takeo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.takeo.pojo.Answer;
import com.takeo.pojo.Question;
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
		 
		 
		 Answer ans = new Answer();
		 ans.setAnsName("Java is a programming language");
		 ans.setPostedBy("Sarita");
		 Answer ans1 = new Answer();
		 ans1.setAnsName("Java is a Object Oriented programming language");
		 ans1.setPostedBy("Tej");
		 ArrayList<Answer> anslist = new ArrayList<Answer>();
		 anslist.add(ans);
		 anslist.add(ans1);
		 
		 Question ques = new Question();
		 ques.setQname("What is java?");
		 ques.setAns_list(anslist);
		 for(int i =0 ; i<anslist.size(); i++)
		 {
			 System.out.println(anslist.get(i).getAid());
		 }
		 ses.save(ques);
		 tx.commit();
		 
		 

		 
	   } 
       catch (Exception e) 
       {
		// TODO Auto-generated catch block
		e.printStackTrace();
       }
       finally
       {
    	   SessionUtil.closeSession(ses);
       }
       
    }
}
