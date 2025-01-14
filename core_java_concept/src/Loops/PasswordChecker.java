package Loops;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password;
		do {
			System.out.println("Please enter your password: ");
			password = input.next();
		}while(!isvalidPassword(password));
			System.out.println("Thanks for entering valid password");
	}
	
	public static boolean isvalidPassword(String password) {
		return password.length()>6;
	}
		
	
		

	}


