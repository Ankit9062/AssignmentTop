package Assign;

import java.util.Scanner;

public class SingleCatch {

	public static void main(String[] args) {
		
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 : ");
		int a= sc.nextInt();
		System.out.println("enter number 2 : ");
		int b = sc.nextInt();
		float c= a/b;
		System.out.println(c);
		}
	catch (ArithmeticException e) 
	{
		System.out.println("number 2 should be greter than 0");// TODO: handle exception
	}
		}
		// TODO Auto-generated method stub

	}

