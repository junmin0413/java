package exam1105;

public class ApplianceExample {

	public static void main(String[] args) {
		WashingMachine wm = new WashingMachine("삼성",187,50);
		
		wm.turnOn();
		wm.printInfo();
	}

}
