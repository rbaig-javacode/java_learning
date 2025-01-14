package Function;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number :");
		int firstNumber = input.nextInt();
		System.out.println("here is the fibonacci series");
		printFibonacci(firstNumber);

	}
	
	public static void printFibonacci(int num) {
		if(num < 0)
			return;
		System.out.print("0 ");
		if(num == 0)
			return;
		System.out.print("1 ");
		int first =0, second=1;
		while(first+second<=num) {
			int third = first+second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}
		
	}

}
