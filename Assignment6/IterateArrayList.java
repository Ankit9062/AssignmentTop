package Assign;

import java.util.ArrayList;
import java.util.List;

class StudentDetails{
	int id;
	String name;
	 StudentDetails(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	 @Override
		 public String toString() 
	 		{
				return "Friends [id=" + id + ", name=" + name + "]";
			}
}


public class IterateArrayList {

	public static void main(String[] args) {
		
		StudentDetails s1 = new StudentDetails(1, "Ankit Patel");
		StudentDetails s2 = new StudentDetails(2, "Dhanoop Menon");
		StudentDetails s3 = new StudentDetails(3, "Lamiya Chaudhary");
		StudentDetails s4 = new StudentDetails(4, "Pal Shrivastav");
		StudentDetails s5 = new StudentDetails(5, "Samay Shah");
		
		List<StudentDetails> Details =  new ArrayList<StudentDetails>();
		Details.add(s1);
		Details.add(s2);
		Details.add(s3);
		Details.add(s4);
		Details.add(s5);
		for(StudentDetails s:Details)
			{
			System.out.println(s);
		// TODO Auto-generated method stub
			}
		
		/*
		 * to remove 3rd element from Array list
		 */
		System.out.println(" After removing 3rd element from Array list");
		
		Details.remove(s3);    
		//System.out.println(Details);
		for(StudentDetails s:Details) 
			{
			System.out.println(s);
		// TODO Auto-generated method stub
			}
}
}
