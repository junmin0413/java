package exam1105;

public class Dog extends Animal{
	private String breed;
	
	public Dog() {
		super();
	}
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	@Override
	public void move() {
		System.out.println("네 발로 걷는다.");
	}
}