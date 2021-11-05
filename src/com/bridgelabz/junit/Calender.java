package com.bridgelabz.junit;

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day");
		int d = sc.nextInt();
		System.out.print("Enter month");
		int m = sc.nextInt();
		System.out.print("Enter year");
		int y = sc.nextInt();

		String day = dayOfWeek(d, m, y);
		System.out.println("Day of week is " + day);

	}

	private static String dayOfWeek(int d, int m, int y) {
		String[] day = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		int i = 0;
		while (i < 7) {
			if (i == d0) {
				return day[i];
			}
			i++;
		}
		return "";
	}

}
