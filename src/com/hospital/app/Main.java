package com.hospital.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b, c;

		System.out.println("Enter 1st number: ");
		a = scan.nextInt();
		System.out.println("Enter 2nd number: ");
		b = scan.nextInt();
		c = a + b;
		System.out.println("The sum is " + c);
		scan.close();
	}
}
