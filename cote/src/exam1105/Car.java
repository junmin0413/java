package exam1105;

public class Car extends Vehicle{
	private int numSeats;
	
	public Car() {
		super();
	}
	public Car(String model, String licensePlate, int numSeats) {
		super(model, licensePlate);
		this.numSeats = numSeats;
	}
	
	public int getNumSeats() {
		return numSeats;
	}
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	@Override
	public void move() {
		System.out.println("도로를 달린다.");
	}
	@Override
	public int calculateToll() {
		return numSeats * 1000;
	}
}
