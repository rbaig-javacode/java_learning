package IfElseLoop;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Number: ");
		int Num = input.nextInt();
		if(Num % 2 == 0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is ODD");
		}

	}

}
