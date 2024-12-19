package operators;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter age: ");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("you are eligible to drive");
		}else {
			
			System.out.println("you are not eligible to drive");
		}

	}

}
