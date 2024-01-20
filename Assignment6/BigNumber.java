package Assign;

import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		
		int A,B,C;
	      Scanner sc = new Scanner(System.in);
		  System.out.println("Enter A =");
		  A = sc.nextInt();
		  System.out.println("Enter B =");
		  B = sc.nextInt();
		  System.out.println("Enter C =");
		  C = sc.nextInt();
		  if (A>=B && A>=C)
		    {
			  System.out.println("Gretest Number is = " + A);
		    }
		  else if (B>=A && B>=C)
		    {
			  System.out.println("Gretest Number is = " + B);
		    }
		  else if (C>=B && C>=A)
		    {
			  System.out.println("Gretest Number is = " + C);
		    }
		// TODO Auto-generated method stub

	}

}
