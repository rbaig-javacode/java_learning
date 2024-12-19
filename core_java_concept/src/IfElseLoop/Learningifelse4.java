package IfElseLoop;

import java.util.Scanner;

public class Learningifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Percentage: ");
		int Percentage = input.nextInt();
		if (Percentage >= 90) {
			System.out.println("Grade A");
		}else if (Percentage >= 75 && Percentage < 90) {
			System.out.println("Grade B");
		}else if (Percentage >= 60 && Percentage < 75) {
			System.out.println("Grade c");
		}else if (Percentage >= 30 && Percentage < 60) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade E");
		}

	}

}
