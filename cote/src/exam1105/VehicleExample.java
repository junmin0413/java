package exam1105;

public class VehicleExample {
	public static void main(String[] args) {
		Car car = new Car("아반떼", "12가3456", 5);
		System.out.println("모델명: " + car.getModel());
		System.out.println("번호판: " + car.getLicensePlate());
		System.out.println("좌석 수: " + car.getNumSeats());
		car.move();
		System.out.println("통행료: " + car.calculateToll() + " 원");
		
		Truck truck = new Truck("포터", "34나7890", 3);
		System.out.println("모델명: " + truck.getModel());
		System.out.println("번호판: " + truck.getLicensePlate());
		System.out.println("적재량: " + truck.getLoadWeight() + " 톤");
		truck.move();
		System.out.println("통행료: " + truck.calculateToll() + " 원");

	}
}
