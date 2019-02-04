package basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number =");
		int number=sc.nextInt();
		boolean flag=true;
		if(number<2)
			flag=false;
		else
		{
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					flag=false;
					break;
				}
			}
		}
		if(flag==true)
			System.out.println("This is a prime number");
		else
			System.out.println("This is not a prime number");
		sc.close();
	}

}
