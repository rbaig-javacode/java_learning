package ControlStatementMathAndString;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your 1st number : ");
		int num = input.nextInt();
		
		String result = num % 2 == 0 ? "even": "odd";
		System.out.println("your number is :" + result);

	}

}
