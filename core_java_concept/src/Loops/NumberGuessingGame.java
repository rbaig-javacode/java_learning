package Loops;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 5, guess;
		System.out.println("WELCOME to the number guessing game");
		do {
			System.out.println("please guess the number between 0 to 10");
			guess = input.nextInt();
		}while(num != guess);
			System.out.println("you have successfully guesses the number");
		
		

	}

}
