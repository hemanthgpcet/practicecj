package com.hemanth.practicecj.minipgms;

import java.util.Scanner;

public class Biggestofthree {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter thrid number");
		int c = sc.nextInt();
		
		System.out.println("Enter first number");

		 int num = (a > b && a > c)?a:(b>c)?b:c;
		

			System.out.println(num + "is bigger");
		
			sc.close();
	}
}