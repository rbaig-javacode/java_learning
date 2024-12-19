package operators;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter age: ");
		int age = input.nextInt();
		System.out.println("are you female ?");
		boolean isFemale = input.nextBoolean();
		
		if(age < 5) {
			System.out.println("you got 75 discount");
		}else if (isFemale) {
			System.out.println("you got 50 discount");
		}else if (!isFemale && age > 60) {
			System.out.println("you got 25 discount");
		}else {
			System.out.println("you dont have discount");
		}

	}

}
