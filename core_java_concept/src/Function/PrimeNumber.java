package Function;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number :");
		int firstNumber = input.nextInt();
		boolean isPrime = isPrime(firstNumber);
		if(isPrime) {
			System.out.println("your number is prime");
		}else {
			System.out.println("your number is not prime");
		}

	}
	
	public static boolean isPrime(int num) {
		int i=2;
		while(i<num)
		{
			if(num%i == 0)
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
