package com.hemanth.practicecj.minipgms;

import java.util.Scanner;

public class Grading {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NAME");
		String name =  sc.next();
		
		System.out.println("Enter the SCORE");
		int score = sc.nextInt();
		
		if(score>=8&&score<=10)
		{
			System.out.println(name + " has got GRADE A");
		}
		else if(score>=5&&score<=7)
		{
			System.out.println(name + " has got GRADE B");
		}
		else if(score<=4)
		{
			System.out.println(name + " has got GRADE C");
		}
		else
			System.out.println(name + " Your score is invalid");
		sc.close();
			
		
}
}
