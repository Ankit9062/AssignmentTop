package Assign;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdate {

	public static void main(String[] args) {
		
		List<String> list_Friends = new ArrayList<String>();
		list_Friends.add("Ankit");
		list_Friends.add("Shivam");
		list_Friends.add("Pal");
		list_Friends.add("Samay");
		list_Friends.add("Shubhman");
		System.out.println(list_Friends);
		list_Friends.set(1, "Harman");
		list_Friends.set(4, "Jaspreet");
		System.out.println(list_Friends);
		// TODO Auto-generated method stub

	}

}
