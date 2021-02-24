package fundamentals.sandbox;

import java.util.Random;

public class PasswordGenerator {
	
	int length;
	String letters1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String letters2 = "abcdefghijklmnopqrstuvwxyz";
	String specialChar = "!@#$%^&*():.-+=1234567890";
	String chars = letters1 + letters2 + specialChar;
	
	Random rand = new Random();
	
	public PasswordGenerator(int len) {
		// TODO Auto-generated constructor stub
		length = len;
	}
	
	String generatePassword() {
		 String[] password = new String[length];
		 String pw = "";
		 for (int i = 0; i < password.length; i++) {
			password[i] = String.valueOf(chars.charAt(rand.nextInt(chars.length())));
			pw = pw + password[i];
		}
		 return pw;
	}

}
