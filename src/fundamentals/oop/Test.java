package fundamentals.oop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString = "Hello World!";
		// this is an unnecessary use of loops.
		char[] myChar = myString.toCharArray();
		for (char i : myChar) {
			System.out.print(i);
		}
	}

}
