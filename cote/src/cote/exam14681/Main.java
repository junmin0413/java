package cote.exam14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1>0) {
			if(num2>0) {
				System.out.print(1);
			}else {
				System.out.print(4);
			}
		}
		if(num1<0) {
			if(num2>0) {
				System.out.print(2);
			}else {
				System.out.print(3);
			}
		}
		
		scanner.close();
	}

}