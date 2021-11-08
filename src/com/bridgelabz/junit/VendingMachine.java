package com.bridgelabz.junit;

import java.util.Scanner;

public class VendingMachine {
	static int note[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int i = 0;
	
	static void calculate(int money, int[] note2) {
	
	int[] noteCalculate = new int[8];
	
	noteCalculate[i] = money / note2[i];
	money = money % note2[i];
	
	System.out.println("Rs." + note2[i] + "\t-->\t" + noteCalculate[i]);
	if (i < 7) {
	i++;
	calculate(money, note);
	}
	}
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int money = sc.nextInt();
	sc.close();
	calculate(money, note);
	
	}

}
