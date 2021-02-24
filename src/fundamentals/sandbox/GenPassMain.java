package fundamentals.sandbox;

import java.io.*;
import java.util.Scanner;

public class GenPassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("save file to: ");
		String path = sc.next();
		System.out.print("How Many Passwords? ");
		int pws = sc.nextInt();
		System.out.print("Password Length? ");
		int pwLen = sc.nextInt();
		
		
		PasswordGenerator pg = new PasswordGenerator(pwLen);
		
		try {
			// write to new file.
			 File myObj = new File(path + "/password.txt");
			 
			 if (!myObj.exists()) {
				myObj.createNewFile();
			}
			 
			PrintWriter pwrtr = new PrintWriter(myObj);
			
			for (int i = 0; i < pws; i++) {
				pwrtr.println(pg.generatePassword());
			}
			pwrtr.close();
			System.out.println("Done generating password.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}	
}