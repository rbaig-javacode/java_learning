package IfElseLoop;

import java.util.Scanner;

public class LeapYearProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Percentage: ");
		int year = input.nextInt();
		if (year%400 == 0 || year%4==0 && year%100 != 0) {
			System.out.println("your year is leap year");
		}else {
			System.out.println("your year is not leap year");
		}

	}

}