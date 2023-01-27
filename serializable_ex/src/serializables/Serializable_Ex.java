package serializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable_Ex implements Serializable
{
	private int i;
	private String s;
	public Serializable_Ex(int i, String s)
	{
		this.i = i;
		this.s = s;
		
	}

	public static void main(String[] args)throws IOException, ClassNotFoundException
	{
		
		//serializing a
		Serializable_Ex a = new Serializable_Ex(20, "Hello");
		
		FileOutputStream fos = new FileOutputStream("hello.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		//De-serializing a
		
		FileInputStream fis = new FileInputStream("hello.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Serializable_Ex b = (Serializable_Ex)ois.readObject();//down-casting object
  
        System.out.println(b.i+" "+b.s);
		
		

	}

}
