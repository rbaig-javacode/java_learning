package operators;

import java.util.Scanner;

public class BitwiseLeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter firstNum: ");
		int firstNum = input.nextInt();
		int result = firstNum << 1;
		System.out.println("Result: " + result);

	}

}
