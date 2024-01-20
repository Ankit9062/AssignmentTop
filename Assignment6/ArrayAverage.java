package Assign;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		
		int Ankit[] = new int[5];
		for (int index=0;  index<Ankit.length;index++)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Ankit["+index+ "] = ");
			Ankit[index]= sc.nextInt();
			
		}
		System.out.println(Arrays.toString(Ankit));
		int sum=0;
		for (int index=0;  index<Ankit.length;index++)
		{
		sum  += Ankit[index];

			}
		float Average=0;
		Average= (float)sum/Ankit.length;
		
		System.out.println("Average of array elements are = "+Average);
		// TODO Auto-generated method stub

	}

}
