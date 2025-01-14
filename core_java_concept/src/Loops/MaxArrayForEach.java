package Loops;

public class MaxArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to the finding maximum");
		int[] arr = {12,23,45,67,78};
		int max = Integer.MIN_VALUE;
		for(int num: arr) {
			if(max<num) {
				max=num;
			}
		}
		System.out.println("Maximum number is :" + max);

	}

}
