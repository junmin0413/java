package exam1105;

public class ShapeExample {
	public static void main(String[] args) {
		Circle cir = new Circle("Red", 5);
		System.out.println(cir.getPerimeter());
		System.out.println(cir.getArea());
		
		Rectangle rec = new Rectangle("Pink", 3, 5);
		System.out.println(rec.getPerimeter());
		System.out.println(rec.getArea());
	}
}
