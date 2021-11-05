package com.bridgelabz.junit;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.print("Enter Decimal number");
		Scanner sc=new Scanner(System.in);
		int decimal=sc.nextInt();
		sc.close();
		if(0<=decimal&&decimal<256) {
		
		int[] bi= {0,0,0,0,0,0,0,0};
		
		for(int i=0;i<8;i++) {
			bi[i]=decimal%2;
			decimal=decimal/2;
		}
		
		for(int n=7;n>=0;n--) {
		System.out.print(bi[n]); 
		}
	}
	else
		System.out.println("Invalid number");
	}

}
