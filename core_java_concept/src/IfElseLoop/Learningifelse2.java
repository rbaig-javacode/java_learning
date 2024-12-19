package IfElseLoop;

import java.util.Scanner;

public class Learningifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Number: ");
		int Num = input.nextInt();
		if (Num > 0) {
			System.out.println("Number is positive");
		}else if(Num < 0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is zero");
		}
		

	}

}
