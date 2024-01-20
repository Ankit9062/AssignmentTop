package Assign;

abstract class Parent
{
	public abstract void message();
	
}

class FullParent1 extends Parent
{
	@Override
	public void message() {
		
		
	System.out.println("This is first subclass ");

		
	}
}

class FullParent2 extends Parent
{
	@Override
	public void message() {	
	System.out.println("This is second subclass ");
		
	}
}

public class ParentAbstract {
	public static void main(String[] args) {
		FullParent1 FP1= new FullParent1();
		FP1.message();
		FullParent2 FP2= new FullParent2();
		FP2.message();
		
	}

}
