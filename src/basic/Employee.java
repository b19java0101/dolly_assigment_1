package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int empId;
	String empName;
	int total_paid_leave=5,total_sick_leave=2,total_casual_leave=2;
	double total_salary,basic_salary;
	Employee() throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter employee Id = ");
		empId=Integer.parseInt(br.readLine());
		System.out.println("Enter your name = ");
		empName=br.readLine();
		System.out.println("Please Enter your basic salary = ");
		basic_salary=Double.parseDouble(br.readLine());
	}
	
	void calculate_balance_leaves()
	{
		
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		return false;
	}
	void calculate_salary() 
	{
		
	}


	

}
