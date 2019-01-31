package HashSetDemo;

import java.util.HashSet;

public class MainClass {
	public static void main(String[] args) {
		// HashSet wokrs without duplicate elements------

		HashSet<String> names = new HashSet<>();

		names.add("Alamgir");
		names.add("Hossain");
		names.add("Abdur");
		names.add("Rahim");
		names.add("Alamgir");
		names.add("Rahim");
		names.add("ABCD");

		for (String x : names) {
			System.out.println(x);
		}
		System.out.println("HashSet  Size : "+names.size());
		
		boolean ck = names.isEmpty();
		System.out.println(ck);
	}
}
