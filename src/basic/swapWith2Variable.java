/*Write a program to swap two numbers without third variable.*/

package basic;
import java.util.Scanner;

public class swapWith2Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Fisrt Number for swapping");
		float first=sc.nextFloat();
		System.out.println("Please Enter the second number for swapping");
		float second=sc.nextFloat();
		System.out.println("\n\nBefore Swapping\n");
		System.out.println("First number= "+first+"\t\tSecond Number="+second+".");
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("\n\nAfter Swapping\n");
		System.out.println("First number= "+first+"\t\tSecond Number="+second+".");
		
		sc.close();
	}

}
