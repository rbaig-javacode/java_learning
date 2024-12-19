package operators;

import java.util.Scanner;

public class OddevenBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * 
         */
		Scanner input = new Scanner(System.in);
		System.out.println("odd and even calculator: ");
		System.out.println("Please enter firstNum: ");
		int firstNum = input.nextInt();
		if((firstNum&1)==1){
			System.out.println("Number is odd");
		}else {
			System.out.println("Number is even");
		}
	}

}
