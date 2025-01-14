package ControlStatementMathAndString;

import java.util.Scanner;

public class MinimumTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your 1st number : ");
		int num1 = input.nextInt();
		System.out.println("Please enter your 2nd number : ");
		int num2 = input.nextInt();
		
		int MinimumNumber = num1<num2?num1:num2;
		System.out.println(MinimumNumber + " is Minimum number");

	}

}
