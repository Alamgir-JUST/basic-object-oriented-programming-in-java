package ClassObjIdea;

public class ClassObject {
	String name,address;
	int roll;
	
	void setinfo(String n,String ad, int r) {
		name = n;
		address = ad;
		roll = r;
	}
	
	void printinfo() {
		System.out.println("Name is : "+name);
		System.out.println("Address is : "+address);
		System.out.println("Roll : "+roll);
	}
}
