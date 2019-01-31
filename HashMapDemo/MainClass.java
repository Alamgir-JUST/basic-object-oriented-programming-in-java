package HashMapDemo;

import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		///All works with put,get------
		HashMap<Integer, String> student = new HashMap<>();
		
		student.put(140126, "Alamgir");
		student.put(140190,"Alamgir");
		student.put(120189, "CSE, JUST");
		
		System.out.println(student.get(140126));
		System.out.println(student.get(140190));
		System.out.println(student.get(120189));
		
	}
}
