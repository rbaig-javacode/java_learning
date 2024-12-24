package Function;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number :");
		int firstNumber = input.nextInt();
		System.out.println("Please enter your number :");
		int secondNumber = input.nextInt();
		
		int lcm = lcm(firstNumber, secondNumber);
		System.out.println(lcm);
		}
	
	public static int lcm(int firstNumber, int secondNumber) {
		int i = 1;
		while(true) {
			int factor = firstNumber * i;
			if (factor % secondNumber == 0) {
				return factor;
			}
			i++;
		}
	}

}
