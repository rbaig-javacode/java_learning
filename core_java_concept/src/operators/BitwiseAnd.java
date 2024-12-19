package operators;

import java.util.Scanner;

public class BitwiseAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter firstNum: ");
		int firstNum = input.nextInt();
		System.out.println("Please enter secondNum: ");
		int secondNum = input.nextInt();
		
		int result = firstNum & secondNum;
		System.out.println("Result: " + result);

	}

}
