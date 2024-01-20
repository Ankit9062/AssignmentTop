package Assign;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a,k=0;
		int j =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		a= sc.nextInt();
		for (int i=2;i<=a-1;i++)
			{
			 
			  if (a%i == 0)
			  {		k=i;
					j++;
				 
			  }
				}
		
		if (j>0)
		{ System.out.println(a + " is not Prime Number");
		  System.out.println(a + " is devided by "+k);
		}
		
		else
		{
			System.out.println(a + " is Prime Number");
			
		}
		// TODO Auto-generated method stub

	}

}
