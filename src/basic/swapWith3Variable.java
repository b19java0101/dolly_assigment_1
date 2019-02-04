/* Write a program to swap two numbers*/
package basic;
import java.util.Scanner;

public class swapWith3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Fisrt Number for swapping");
		int first=sc.nextInt();
		System.out.println("Please Enter the second number for swapping");
		int second=sc.nextInt();
		System.out.println("\n\nBefore Swapping\n");
		System.out.println("First number= "+first+"\t\tSecond Number="+second+".");
		int temp=first;
		first=second;
		second=temp;
		System.out.println("\n\nAfter Swapping\n");
		System.out.println("First number= "+first+"\t\tSecond Number="+second+".");
		
		sc.close();
	}

}
