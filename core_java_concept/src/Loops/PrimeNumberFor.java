package Loops;

import java.util.Scanner;

public class PrimeNumberFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean isPrime = isPrime(num);
		System.out.println("your number is " + (isPrime ? "Prime" : "Not Prime"));

	}
	
	public static boolean isPrime(int num) {
		for (int i = 2;i<=num;i++) {
			if(num%2 == 0) {
				return false;
			}
		}
		return true;
	}

}
