package com.hemanth.practicecj.minipgms;

import java.util.Scanner;

public class Printingntimes {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NAME");
		String name =  sc.next();
		
		System.out.println("Enter the number of time to print");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
		  System.out.println(name+" Welcome to Java");	
		}
		sc.close();

}
}
