package MethodOverriding;

public class SecondClass extends firstClass{

	String address;
	
	@Override
	void showinfo() {
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Addres : "+address);
	}
}
