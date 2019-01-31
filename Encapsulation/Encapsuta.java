package Encapsulation;

//Encapsulation is a process of packaging variables & methods...
//Protecting data by declaring them as  a private...
//Uses getters and setters for modify the data------
public class Encapsuta {

	private String name;
	private int roll;
	
	void setinfo(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
	void show() {
		System.out.println("Name is : "+name);
		System.out.println("Roll is : "+roll);
	}
	
	
}
