package cote.exam2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		
		if(num1%4==0) {
			if(num1%100!=0 || num1%400==0) {
				System.out.print(1);
				
			}else {
				System.out.print(0);
			}
		} else {
			System.out.print(0);
		}
		scanner.close();
	}

}