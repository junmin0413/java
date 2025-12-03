package exam1105;

public class Bird extends Animal{
	private double wingSpan;
	
	public Bird() {
		super();
	}
	public Bird(String name, int age, double wingSpan) {
		super(name, age);
		this.wingSpan = wingSpan;
	}
	
	public double getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
	@Override
	public void move() {
		System.out.println("날아서 이동한다");
	}
	
}
