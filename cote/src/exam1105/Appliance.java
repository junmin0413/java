package exam1105;

public class Appliance {
	private String brand;
	private int power;
	
	public Appliance() {
	}
	public Appliance(String brand, int power) {
		this.brand = brand;
		this.power = power;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	public void printInfo() {
		System.out.println("브랜드: " + brand);
		System.out.println("전력: " + power);
	}
}
