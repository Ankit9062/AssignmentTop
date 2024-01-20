package Assign;

public class FibSeries {

	public static void main(String[] args) {
		
		int b=1,d=0;
		for(int a=1;d<=20;d++) 
		{
			if(a==1 &&b==1) 
			{
				System.out.print(a+" "+b);
			}
		int  c= a + b;
		System.out.print(" ");
			System.out.print(c);
			a=b;
			b=c;
		// TODO Auto-generated method stub

	}

	}
}
