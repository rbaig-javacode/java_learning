package Function;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number : ");
		int num = input.nextInt();
		int sum = SumOfDigit(num);
		System.out.println(sum);

	}
	
	public static int  SumOfDigit(int num)
	{
	    int sum = 0;
	    while (num > 0) {
	    	sum += num%10;
	    	num = num /10;
	    	
	    }
		return sum;
		
	}

}
