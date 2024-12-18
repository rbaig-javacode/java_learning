package datatype_variable_input;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter your name: ");
		String name = input.nextLine();
		System.out.println("Good Morning " +name);
		System.out.print(name + ", also tell me your age:");
		int age = input.nextInt();
		System.out.println("your age is: " +age);
		
	}

}
