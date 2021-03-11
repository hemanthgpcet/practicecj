package com.hemanth.practicecj.minipgms;

import java.util.Scanner;

public class Multplicationoftable {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the table to multiply");
	int num = sc.nextInt();
	System.out.println("Enter the number till you want to multiply");
	int n = sc.nextInt();
	for(int i=n;i>=1;i--)
	{
		System.out.println(num + " X "+ i +" = " + num*i);
		
	}
	sc.close();

}
}