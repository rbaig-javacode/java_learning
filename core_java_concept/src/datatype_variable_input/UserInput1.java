package datatype_variable_input;

import java.util.Scanner;

public class UserInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter your name: ");
		String name = input.nextLine();
		System.out.println("welcome " +name+ " to the Program");

	}

}
