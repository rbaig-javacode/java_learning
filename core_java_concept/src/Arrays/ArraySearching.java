package Arrays;

import java.util.Scanner;

public class ArraySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] arr = {3,6,8,87,65,4,67,23,9,98,34};
		System.out.println("Enter the number you want to search");
		int num = input.nextInt();
		boolean isFound = isFound(arr,num);
		if(isFound) {
			System.out.println("your number is found in an array");
		}else {
			System.out.println("your number is not found in an array");
		}

	}
	
	public static boolean isFound(int[] arr, int num) {
		int index =0;
		while(index < arr.length) {
			if(arr[index] == num) {
				return true;
			}
			index++;
		}
		return false;
	}

	
	//String[] strArr = new String[4];
	//strArr[0] = "My String";
	//String[] newStrArr = {"first","second","third"};
	
	
}		
	

