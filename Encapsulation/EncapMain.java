package Encapsulation;

public class EncapMain {
	public static void main(String[] args) {
		Encapsuta ob = new Encapsuta();
		
		ob.setinfo("Alamgir Hossain", 140126);
		ob.show();
		
		

		//GetSetclass start-------
		GetSetClassDemo ob1 = new GetSetClassDemo();
		
		ob1.setAddress("Magura");
		ob1.setExperience("JAVA");
		ob1.setCgpa(3.10);
		
		System.out.println(ob1.getAddress());
		System.out.println(ob1.getExperience());
		System.out.println(ob1.getCgpa());
	}
		
}
