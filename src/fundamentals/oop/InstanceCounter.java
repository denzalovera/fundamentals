package fundamentals.oop;


public class InstanceCounter {
	
	private static int numInstance = 0;
	
	protected static int getCouunt() {
		return numInstance;
	}
	
	private static void addInstance() {
		numInstance++;
	}
	
	InstanceCounter(){
		InstanceCounter.addInstance();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Starting with " + InstanceCounter.getCouunt() + " instances");
		
		for (int i = 0; i < 500; i++) {
			new InstanceCounter();
		}
		System.out.println("Created "+ InstanceCounter.getCouunt() + " instances");

	}

}
