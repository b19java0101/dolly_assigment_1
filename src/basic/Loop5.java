package basic;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		for(int i=1;i<=3;i++)
		{
			x=97;
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)x);
				x++;
			}
			for(int d=1;d<=i-1;d++)
			{
				x=x-2;
				System.out.print((char)x);
				x++;
			}
			
		
		System.out.println();
		
		
		
		}
		for(int s=1;s<=2;s++)
		{
			x=97;
			for(int l=1;l<=s;l++)
			{
				System.out.print(" ");
			}
			for(int m=2;m>=s;m--)
			{
				
				System.out.print((char)x);
				x++;
			}
			for(int n=2;n>s;n--)
			{
				x=97;
				System.out.print((char)x);
			}
			System.out.println();
		}
		


	}

}
