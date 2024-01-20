package Assign;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int Ankit[] = new int[size];
		for(int index=0;index<Ankit.length;index++) {
			System.out.print("enter element at Ankit["+index+"] : ");
			Ankit[index] = sc.nextInt();
		}
		
		int Shivam[] = new int[Ankit.length];
		for (int index=0;index<Ankit.length;index++)
		{
			Shivam[index]= Ankit[(Ankit.length-1)-index];
		// TODO Auto-generated method stub

	}System.out.println(Arrays.toString(Shivam));

}
}
