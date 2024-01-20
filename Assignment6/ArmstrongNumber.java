package Assign;

import java.util.Scanner;

class CountDigit
{
	int Counter=0;
	CountDigit(int InputNumber)
	{
	
	while(InputNumber!=0)
	{
		InputNumber=InputNumber/10;
		Counter++;
		// Counter=this.Counter;
		
	}
	}
	public int Calculate(int InputNumber)
	{
		int  Reminder;
		int Sum=0;
		for(int Loop1=1;Loop1<=Counter;Loop1++)
		{
			int Multi=1;
			Reminder=InputNumber%10;
			InputNumber = InputNumber/10;
			for(int Loop2=1;Loop2<=Counter;Loop2++)
			{
				Multi *= Reminder;
			}
			Sum += Multi;
		} return Sum;
	}
		
		public void Result(int Temp, int Sum)
		{
		if(Sum==Temp)
		{
			System.out.println("Number is ARMSTRONG number");
		}
		else if(Sum!=Temp)
		{
			System.out.println("Number is not ARMSTRONG number");
		}			
}		
}

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter number : ");
		int InputNumber= sc.nextInt();
		CountDigit cd = new CountDigit(InputNumber);
		int Sum =  cd.Calculate(InputNumber);
		cd.Result(InputNumber, Sum);
		sc.close();
	}
}


