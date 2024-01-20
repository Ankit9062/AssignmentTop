package Assign;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
int a=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		double b=1;
		a= sc.nextInt();
		int j=1;
		for (j=1; j<=a; j++)
			
		{
			 b *= j;
			
		}
    System.out.println(b);
		
		// TODO Auto-generated method stub

	}

}
