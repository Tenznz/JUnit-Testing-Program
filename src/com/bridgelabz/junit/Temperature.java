package com.bridgelabz.junit;

import java.util.Scanner;

public class Temperature {
	static Scanner sc = new Scanner(System.in);

	public static void temperatureConversion(int choose) {
		double fahrenheit, celsius;

		if (choose == 1) {
			System.out.print("Fahrenheit : ");
			fahrenheit = sc.nextDouble();
			celsius = (fahrenheit - 32) * ((double) 5 / 9);
			System.out.println("Celsius : " + Math.floor(celsius) + "°C");
		} else if (choose == 2) {
			System.out.print("Celsius : ");
			celsius = sc.nextDouble();
			fahrenheit = (celsius * 9 / 5) + 32;
			System.out.println("Fahrenheit : " + Math.floor(fahrenheit) + "°F");
		} else {
			System.out.println("Invalid number");

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number \n1.Fahrenheit\n2.Celsius");
		int choose = sc.nextInt();

		temperatureConversion(choose);

	}
}
