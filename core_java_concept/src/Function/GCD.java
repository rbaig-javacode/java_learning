package Function;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number :");
		int firstNumber = input.nextInt();
		System.out.println("Please enter your number :");
		int secondNumber = input.nextInt();
		
		int gcd = gcd(firstNumber, secondNumber);
		System.out.println(gcd);

	}
	
	public static int gcd(int num1, int num2) {
		int gcd = 1;
		int i = 2;
		int least = least(num1,num2);
		while(i<=least) {
			if(num1 % i ==0 && num2 % i ==0) {
				gcd = i;
			}
			i++;
		}
		return gcd;
	}
	
	public static int least (int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}else {
			return num2;
		}
			
	}

}
