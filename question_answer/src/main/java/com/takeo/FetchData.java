package com.takeo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.takeo.pojo.Answer;
import com.takeo.pojo.Question;
import com.takeo.util.SessionUtil;

public class FetchData 
{
	public static void main(String []args)
	{
		Session ses = null;
		Transaction tx = null;
		try
		{
			ses = SessionUtil.getSession();
		
			Query query = ses.createQuery("from Question");
			List<Question> question = query.getResultList();
			Iterator<Question> it = question.iterator();
			System.out.println("Question and answer:");
			while(it.hasNext())
			{
				Question q = it.next();
				System.out.print("Question name: " + q.getQname());
				List<Answer> ans = q.getAns_list();
				//System.out.println("print the answers");
				for(Answer an : ans)
				{
					System.out.println(an.getAnsName()+"\t" +  an.getPostedBy());
				}
			}
			
	
	}catch(Exception e)
		{
		
		}

}
}