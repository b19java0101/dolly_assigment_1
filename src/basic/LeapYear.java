/*Write a program to check whether a year is leap year or not.
 * User Inputs:
 * 				1) Year
 * */
package basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the year");
		int year=sc.nextInt();
		if(year%400==0 || year%4==0 && year%100!=0)
		System.out.println(year+" is a leap year.");
		else
		System.out.println(year+" is not a leap year.");
		sc.close();
	}

}
