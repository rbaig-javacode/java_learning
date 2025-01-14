package Arrays;

import java.util.Scanner;

public class ArraySumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to sum and average");
        System.out.println("Please enter number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i<size) {
        	System.out.print("Please enter element no " + (i+1) + ":");
        	nums[i] = input.nextInt();
        	i++;
        }
        
        
	}

}
