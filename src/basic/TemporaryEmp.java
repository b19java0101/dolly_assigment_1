package basic;

import java.io.IOException;

public class TemporaryEmp extends Employee{
	int paid_leave, sick_leave, casual_leave;	
	double basic, hra,pfa;
	TemporaryEmp() throws IOException
	{
		super();
		System.out.println(" temp call");
	}
	void calculate_balance_leaves()
	{
		
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		return true;
	}
	void calculate_salary()
	{
		
	}



}
