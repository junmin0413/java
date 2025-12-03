package exam1105;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
	}
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
}
