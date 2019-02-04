package basic;

import java.io.IOException;

public class PermanentEmp extends Employee
{
	int paid_leave, sick_leave, casual_leave;	
	double basic, hra,pfa,deduction;
	boolean flag=false;
	PermanentEmp() throws IOException
	{
		
		paid_leave=0;//no salary deduct
		sick_leave=0;// salary deduct
		casual_leave=0;//salary deduct
		
	}
	void print_leave_details()
	{
		System.out.println("\n\n\t\tTotal Leave Detail \n\n");
		System.out.println("\tPaid leave\tSick Leave\tCasual Leave\n");
		System.out.println("\t"+total_paid_leave+"\t\t"+total_sick_leave+"\t\t"+total_casual_leave+"\n\n");
		
	}
	void calculate_balance_leaves()
	{
		
		System.out.println("\n\n\t\t Balance Leave Detail \n\n");
		System.out.println("\tPaid leave\tSick Leave\tCasual Leave\n");
		System.out.println("\t"+(total_paid_leave-paid_leave)+"\t\t"+(total_sick_leave-sick_leave)+"\t\t"+(total_casual_leave-casual_leave)+"\n\n");
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		if(type_of_leave=='p') 
		{	
			
			if(paid_leave+no_of_leaves<=5)
			{
				paid_leave=paid_leave+no_of_leaves;
				flag=true;
			}
			else 
			{
				flag=false;
			}
			
		}
		else if(type_of_leave=='s') 
		{	
			
			if(sick_leave+no_of_leaves<=2)
			{
				sick_leave=sick_leave+no_of_leaves;
				flag=true;
			}
			else 
			{
				flag=false;
			}
			
		}
		else if(type_of_leave=='c') 
		{	
			
			if(casual_leave+no_of_leaves<=2)
			{
				casual_leave=casual_leave+no_of_leaves;
				flag=true;
			}
			else 
			{
				flag=false;
			}
			
		}
		
		return flag;
	}
	void calculate_salary()
	{
		//Deduction=basic_salary
		pfa = (12/100)*basic_salary;
		hra = (50/100)*basic_salary;
		total_salary=basic_salary+hra-pfa;
	

	}



}
