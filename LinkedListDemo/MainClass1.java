package LinkedListDemo;

import java.util.LinkedList;

public class MainClass1 {
	public static void main(String[] args) {
		LinkedList<String> country_Names = new LinkedList<String>();
		
		country_Names.add("Bangladesh");
		country_Names.add("India");
		country_Names.add("Pakistan");
		country_Names.add("Nepal");
		country_Names.add("Bhutan");
		//Function start---------
		
		country_Names.addFirst("Afgansthan");
		country_Names.addLast("Maldip");
		
		//Removing-----
		//country_Names.removeFirst();
		//country_Names.removeLast();
		//country_Names.remove("Nepal");
		
		
		System.out.println("First Element : "+country_Names.getFirst());
		System.out.println("Last Element : "+country_Names.getLast());
		
		for(String x: country_Names) {
			System.out.println(x);
		}
		
		System.out.println("Size : "+country_Names.size());
		
		country_Names.clear();///Clear list-------
		
		System.out.println(country_Names);
		
	}
}
