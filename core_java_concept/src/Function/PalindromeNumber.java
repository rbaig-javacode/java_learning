package Function;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number : ");
		int num = input.nextInt();
		boolean isPalindrome = isPalindrome(num);
		if(isPalindrome) {
			System.out.println("your number is Palindrome");
		}else {
			System.out.println("your number is not Palindrome");
		}
	}
	
	public static boolean isPalindrome(int num) {
		int reverse = ReverseNumber(num);
		return num == reverse;
		
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
