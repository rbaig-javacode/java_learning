package Function;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number :");
		int firstNumber = input.nextInt();
		boolean isArmstrong = isArmstrong(firstNumber);
		if(isArmstrong) {
			System.out.println("your number is armstrong");
		}else {
			System.out.println("your number is not armstrong");
		}

	}
	
	public static boolean isArmstrong(int num) {
		int noOfDigits = noOfDigits(num);
		int finalNumber = 0;
		int numCopy = num;
		while (num >0) {
			int lastdigits = num%10;
			num /=10;
			finalNumber += pow(lastdigits, noOfDigits);
			
		}
		return finalNumber == numCopy;
	}
	
	public static int pow(int num1, int num2) {
		int result = 1;
		int i = 0;
		while (i < num2) {
			result *= num1;
			i++;
		}
		return result;
	}
	
	public static int noOfDigits(int num) {
		int digits = 0;
		while (num > 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}

}
