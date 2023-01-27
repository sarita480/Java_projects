package clonable_ex;

public class CloneEx implements Cloneable
{
	
	private int i;
	private String s;
	
	public CloneEx(int i, String s)
	{
		this.i = i;
		this.s = s;
		
	}
	@Override
	public Object clone()throws CloneNotSupportedException
	{
		
		return super.clone();
	}
	public static void main(String [] args)
	{
		CloneEx a = new CloneEx(20, "Hello");
		try 
		{
			CloneEx b = (CloneEx)a.clone();
			System.out.println(b.i);
			System.out.println(b.s);
		} 
		catch (CloneNotSupportedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
