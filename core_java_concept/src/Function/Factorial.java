package Function;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number : ");
		int num = input.nextInt();
		long fact = Factorial(num);
		System.out.println(fact);

	}
	
	public static long Factorial (int num)
	{
		if(num<2) {
			return 1;
		}
		long fact = 1;
		int i = 2;
		while(i<=num) {
			fact = fact * i;
			i++;
		}
		return fact;
		
	}

}
