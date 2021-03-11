package com.hemanth.practicecj.minipgms;

import java.util.Scanner;

public class LoweBoundToUpperBound {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Lower bound number");
		int low = sc.nextInt();
		System.out.println("Enter the upper bound number");
		int upper = sc.nextInt();
	 
		for(int i=low;i<=upper;i++)
		{
			System.out.println(i);
		}

}
}