/**
 * 
 */
package Assign;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class ArraySum {

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
System.out.println("Total sum of array elements are = "+sum);

}
}
