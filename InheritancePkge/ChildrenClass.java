package InheritancePkge;

public class ChildrenClass extends FatherClass{

	String name;
	int age;
	
	void setchildinfo(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	void showchild() {
		show();
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}

}
