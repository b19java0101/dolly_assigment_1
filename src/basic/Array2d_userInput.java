package basic;

import java.util.Scanner;

public class Array2d_userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows for 2D array");
		int row=sc.nextInt();
		System.out.println("Enter no. of columns for 2D array");
		int col=sc.nextInt();
		System.out.println("Enter nos");
		int[][] arr=new int[row][col];
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[i].length;j++)
		{
		arr[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(	arr[i][j]+ "\t");
			
		}
		System.out.println();
		}
		sc.close();
	}

}
