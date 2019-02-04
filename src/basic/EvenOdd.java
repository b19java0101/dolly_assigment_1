/*Write a program to check whether a number is not even odd.
 * User input:
 * 				1) Number
 * */
package basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number to check whether a number is even or odd=");
		int number=sc.nextInt();
		if(number%2==0)
		System.out.println(number+" is even.");
		else
		System.out.println(number+" is odd");
		sc.close();
	}

}
