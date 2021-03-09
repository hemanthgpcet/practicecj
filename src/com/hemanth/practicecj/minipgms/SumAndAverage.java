package com.hemanth.practicecj.minipgms;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		System.out.println("Enter number 3");
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		float avg=sum/(float)3;
		System.out.println("Average of your number is "+avg);
		sc.close();
	}

}
