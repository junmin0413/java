package cote.exam10869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.print(num1 + num2);
		System.out.print("\n");
		System.out.print(num1 - num2);
		System.out.print("\n");
		System.out.print(num1 * num2);
		System.out.print("\n");
		System.out.print(num1 / num2);
		System.out.print("\n");
		System.out.print(num1 % num2);
		scanner.close();
	}

}
