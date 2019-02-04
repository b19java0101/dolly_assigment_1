/*Write a program to calculate the division of a student.
 * User input:-
 * 			1) Total marks obtained by student(in %)*/
package basic;

import java.util.Scanner;

public class DivisionOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");
		float per=sc.nextFloat();
		if(per>=80 && per<=100)
		System.out.println("Congratulations !!!! You got merit ");
		else if(per>=60 && per<80)
		System.out.println("You got First Division.");
		else if(per>=50 && per<60)
		System.out.println("You got Second Division.");
		else if(per>=40 && per<50)
		System.out.println("You got Third Division.");
		else if(per<40)
			System.out.println("You are fail.Please Work Hard for next time");
		else
		System.out.println("Please enter valid input");
		float a=5.0f;
		
			System.out.println(a/2);
		
		sc.close();
	}

}
