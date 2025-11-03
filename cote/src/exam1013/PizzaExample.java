package exam1013;

import java.util.Scanner;

public class PizzaExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String size = sc.next();
		sc.close();
		
		Pizza pizza;
		
		if(name.equals("C")) {
			pizza = new CheezePizza(size);
		}else if(name.equals("B")){
			pizza = new BulgogiPizza(size);
		}
		else {
			pizza = new PepperoniPizza(size);
		}
		
		pizza.cook();
		pizza.serve();
	}
}