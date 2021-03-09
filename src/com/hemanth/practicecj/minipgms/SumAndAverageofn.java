package com.hemanth.practicecj.minipgms;

import java.util.Scanner;

public class SumAndAverageofn {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String stop="";
	int count = 1;
	int total=0;
	float average=(float) 0.0;
    while(stop!="yes")
	{
	System.out.println("Enter numbers to average");
	int num=sc.nextInt();
    total=total + num;
    average = total/count;
    System.out.println("Average of entered " + count + " numbers is " + average);
    count++;
	}
   
	sc.close();

}
}
