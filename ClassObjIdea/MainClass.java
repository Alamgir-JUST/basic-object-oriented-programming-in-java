package ClassObjIdea;

public class MainClass {
	public static void main(String[] args) {
		ClassObject obj1 = new ClassObject();

		obj1.setinfo("Alamgir Hossain", "Magura", 140126);
		obj1.printinfo();
		
		///Constructor class mechanism---
		System.out.println();
		
		ConstructorClass obj2 = new ConstructorClass("Alamgir Hossain","Mohammadpur",140126);
		obj2.printinfo();
	}
}
