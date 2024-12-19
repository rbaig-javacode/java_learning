package Function;

import java.util.Scanner;

public class ReturnStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetUser();
		int FirstNum = readNumber();
		int SecondNum = readNumber();
		int result = FirstNum + SecondNum;
		System.out.println("Addition of two number : " + result);

	}
	
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter Number: ");
		int Num = input.nextInt();
		return Num;
	}
	
	public static void greetUser() {
		System.out.println("Welcome to Calculator");
	}

}
