package exam1105;

public class WashingMachine extends Appliance{
	private int drumSize;
	
	public WashingMachine() {
	}
	public WashingMachine(String brand, int power, int drumSize) {
	    super(brand, power);
	    this.drumSize = drumSize;
	}

	
	public int getDrumSize() {
		return drumSize;
	}
	public void setDrumSize(int drumSize) {
		this.drumSize = drumSize;
	}
	
	@Override
	public void turnOn() {
	    System.out.println("세탁기를 켭니다.");
	}

	@Override
	public void turnOff() {
	    System.out.println("세탁기를 끕니다.");
	}
	@Override
	public void printInfo() {
		System.out.println("브랜드: " + getBrand());
		System.out.println("전력: " + getPower());
		System.out.println("드럼 용량: "+ drumSize);
	}
}
