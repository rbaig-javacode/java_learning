package Loops;

public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=1000;i++) {
			if(i==101) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("out of loop");
		
		System.out.println("before continue loop");
		for (int i = 1; i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("out of loop");

	

	}
	
	

}
