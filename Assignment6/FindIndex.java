package Assign;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int Ankit[] = new int[size];
		for(int index=0;index<Ankit.length;index++) {
			System.out.print("enter element at Ankit["+index+"] : ");
			Ankit[index] = sc.nextInt();
		}
	
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter =0;
		int Place=0;
		for(int index=0;index<Ankit.length;index++) {
			if(num == Ankit[index]) {
				counter++;
				Place=index;
				
			}
		}
		if(counter>0) {
			System.out.println("yes exist "+counter+" times");
			System.out.println("exist at Ankit["+Place+"]");
		}
		else {
			System.out.println("not exist");
		}
		// TODO Auto-generated method stub

	}

}
