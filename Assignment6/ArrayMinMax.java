package Assign;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int Ankit[] = new int[size];
		for(int index=0;index<Ankit.length;index++)
		{
			System.out.print("enter element at Ankit["+index+"] : ");
			Ankit[index] = sc.nextInt();
		}
		int tempmin=Ankit[0];
		int tempmax=Ankit[0];
		for (int index= 1;index<=Ankit.length-1; index++) 
		{
			if (tempmin>=Ankit[index])
			{
				tempmin=Ankit[index];
				
			}
			else if (tempmax<=Ankit[index])
			{
				tempmax=Ankit[index];
			}
			
		}
		System.out.println("Smallest Number in array is " + tempmin);
		System.out.println("Biggest Number in array is " + tempmax);
		
		// TODO Auto-generated method stub

	}

}
