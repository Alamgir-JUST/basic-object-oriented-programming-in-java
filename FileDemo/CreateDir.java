package FileDemo;

import java.io.File;
import java.util.Scanner;

public class CreateDir {

	public static void main(String[] args) {
		
		File dir = new File("src/images");
		dir.mkdir();
		
		///Finding Directory Location0---
		/*
		String dirLocation = dir.getAbsolutePath();
		System.out.println(dirLocation);
		System.out.println(dir.getName());
		*/
		//Scanner scanner = new Scanner(System.in);
		String path = dir.getAbsolutePath();
		
		File file1 = new File(path+"/alamgir.txt");
		
		try {
			file1.createNewFile();
			System.out.println("File created!!!!!!!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if(file1.exists()) {
			System.out.println("File Exist!!!!!");
		}
		
	}

}
