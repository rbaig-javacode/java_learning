package Function;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number : ");
		int num = input.nextInt();
		int sum = ReverseNumber(num);
		System.out.println(sum);

	}
	
	public static int  ReverseNumber(int num)
	{
	    int newNum = 0;
	    while (num > 0) {
	    	int digit = num % 10;
	    	newNum = newNum * 10 +digit;
	    	num = num/10;
	    }
		return newNum;
		
	}

}
