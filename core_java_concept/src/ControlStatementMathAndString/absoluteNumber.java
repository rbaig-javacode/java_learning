package ControlStatementMathAndString;

import java.util.Scanner;

public class absoluteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your 1st number : ");
		int num = input.nextInt();
		
		int result = num >= 0 ? num: -num;
		System.out.println("your number is :" + result);

	}

}
