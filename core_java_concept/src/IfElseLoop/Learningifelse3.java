package IfElseLoop;

import java.util.Scanner;

public class Learningifelse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter firstNum: ");
		int firstNum = input.nextInt();
		System.out.println("Please enter secondNum: ");
		int secondNum = input.nextInt();
		System.out.println("Please enter thirdNum: ");
		int thirdNum = input.nextInt();
		if(firstNum > secondNum && firstNum > thirdNum) {
			System.out.println("firstnum is greater");
		}else if (firstNum < secondNum && secondNum > thirdNum) {
			System.out.println("secondNum is greater");
		}else {
			System.out.println("thirdNum is greater");
		}

	}

}
