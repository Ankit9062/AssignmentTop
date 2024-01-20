package Assign;



public class Pattern {

	public static void main(String[] args) {
		
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		for (int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
	
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 
		 */
		
		for (int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		/*
		 * 0
		 * 10
		 * 010
		 * 1010
		 * 01010
		 */
		
		
	
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
				{
				if((r+c)%2 ==0)
					{
					System.out.print("0");
					}
				else 
					{
					System.out.print("1");
					}
				}
			System.out.println();
		
		// TODO Auto-generated method stub

	}
		
		
		/*
*		 * *
**
***
****
*****
****
***
**
*
		 */
		
		
		for (int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row=4;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		/**   
     *
    **
   ***
  ****
 *****
		 */
		
		
		
		
		for (int row=1;row<=5;row++)
		{
			for(int space1=5;space1>=row;space1--)
			{
				System.out.print(" ");
			}
			
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
				
				
			}
				
			System.out.println();
		}
		
		
	
		
		
		

		
	}	

}


