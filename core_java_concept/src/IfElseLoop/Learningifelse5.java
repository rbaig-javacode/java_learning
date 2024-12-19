package IfElseLoop;

import java.util.Scanner;

public class Learningifelse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Percentage: ");
		int age = input.nextInt();
		if (age >= 60) {
			System.out.println("Senior Citizen");
		}else if (age < 60 && age >= 20) {
			System.out.println("Adult Citizen");
		}else if (age < 20 && age >= 13) {
			System.out.println("Teen Citizen");
		}else {
			System.out.println("Child");
		}

	}

}
