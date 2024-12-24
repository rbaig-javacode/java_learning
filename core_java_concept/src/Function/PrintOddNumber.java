package Function;

import java.util.Scanner;

public class PrintOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number : ");
		int num = input.nextInt();
		int sum = PrintOdd(num);
		System.out.println(sum);
		

	}
	
	public static int PrintOdd (int num)
	{
		int sum = 0;
		int i = 1;
		while(i <= num) {
			sum += i;
			i += 2;
		}
		return sum;
		
	}

}
