package Assign;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Ankit="Hello, What's up?";
		String Shivam="Hello, What's up?";
		String Aakib = "hello, what;s up?";
		String Pal = "hello, what's up?";
		System.out.println(Ankit.equals(Shivam));
		System.out.println(Ankit.equalsIgnoreCase(Aakib));
		System.out.println(Ankit.equalsIgnoreCase(Pal));
	}

}
