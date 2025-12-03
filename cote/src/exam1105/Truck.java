package exam1105;

public class Truck extends Vehicle{
	public int loadWeight;
	
	public Truck() {
		super();
	}
	public Truck(String model, String licensePlate, int loadWeight) {
		super(model, licensePlate);
		this.loadWeight = loadWeight;
	}
	public int getLoadWeight() {
		return loadWeight;
	}
	public void setLoadWeight(int loadWeight) {
		this.loadWeight = loadWeight;
	}
	
	@Override
	public void move() {
		System.out.println("도로를 느리게 달린다.");
	}
	@Override
	public int calculateToll() {
		return loadWeight * 5000;
	}
}
