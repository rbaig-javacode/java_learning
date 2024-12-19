package operators;

import java.util.Scanner;

public class BitwiseCompliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter firstNum: ");
		int firstNum = input.nextInt();
		
		
		int result = ~firstNum;
		System.out.println("Result: " + result);

	}

}
