package com.bridgelabz.junit;

import java.util.Scanner;

public class Payment {
	static double monthlyPayment(double P, double Y, double R) {
		double n, r;
		n = 12 * Y;
		r = R / (12 * 100);
		return (P * r) / (1 - Math.pow(1 + r, -n));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Principal : ");
		double P = sc.nextDouble();
		System.out.println("Years : ");
		double Y = sc.nextDouble();
		System.out.println("Compounded Interest : ");
		double R = sc.nextDouble();

		double payment = monthlyPayment(P, Y, R);
		System.out.println("Monthly Payment" + payment);

	}

}
