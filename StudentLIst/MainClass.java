package StudentLIst;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {

		LinkedList<Student_Info> sList = new LinkedList<Student_Info>();

		Student_Info s1 = new Student_Info("Alamgir", "140126", 23);
		Student_Info s2 = new Student_Info("Alamgir", "140126", 23);
		Student_Info s3 = new Student_Info("Alamgir", "140126", 23);
		Student_Info s4 = new Student_Info("Alamgir", "140126", 23);
		Student_Info s5 = new Student_Info("Alamgir", "140126", 23);

		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);

		for (Student_Info std : sList) {
			System.out.println(std.name + " " + std.roll + " " + std.age);
		}

	}
}
