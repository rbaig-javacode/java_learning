package datatype_variable_input;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our calculator");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a + b;
		System.out.println("Addition of two number: "+c);

	}

}
