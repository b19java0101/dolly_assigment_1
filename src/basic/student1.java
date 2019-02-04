package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class student1 {
	int rollNumber;
	String Name;
	float Marks;
	char gender;
	student1() throws IOException
	{ 
		
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		System.out.println("Enter Name");
		Name=br.readLine();
		System.out.println("Enter Roll Number");
		rollNumber=Integer.parseInt(br.readLine());
		System.out.println("Enter your Marks");
		Marks=Float.parseFloat(br.readLine());
		System.out.println("Enter Gender");
		//gender=(char)br.read();
		gender=br.readLine().charAt(0);

	}
	void display()
	{
		System.out.println(rollNumber+"  "+Name+"  "+Marks+ "  "+gender);
	}

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
			student1 s= new student1();
	s.display();
	}

}
