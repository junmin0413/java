package exam1105;

public class Rectangle extends Shape{
	public double width;
	public double height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
