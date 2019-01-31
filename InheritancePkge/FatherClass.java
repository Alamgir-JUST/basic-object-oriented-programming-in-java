package InheritancePkge;

public class FatherClass {
	String address;
	String Dynasty_Identification;
	
	void setinfo(String address,String Dynasty_Identification) {
		this.address = address;
		this.Dynasty_Identification = Dynasty_Identification;
	}
	
	void show() {
		System.out.println("Address : "+address);
		System.out.println("Identification : "+Dynasty_Identification);
	}
}
