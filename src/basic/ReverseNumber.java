/*Write a program to calculate sum of 4 digit number and reverse of the number.
 * for eg:
 * 			if the number is:1234
 * Then reverse of the number will be:4321
 * and result=1234+4321=5555*/
package basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int num=sc.nextInt();
		int sum=0,rem=0,number1=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum=sum*10+rem;
		}
		System.out.println("sum of the reverse number with original number is "+(sum+number1));
		sc.close();
	}

}
