package ToString;

public class A {
	String name;
	int age;
	
	A(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name is : "+name+" Age : "+age;
	}
}
