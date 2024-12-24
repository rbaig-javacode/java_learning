package Function;

public class Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = sumTwoNumbers(4,7);
		int num1 = sumTwoNumbers(8,-9);
		System.out.println(num);
		System.out.println(num1);

	}
	
	public static int sumTwoNumbers (int first, int second)
	{
		System.out.println("first number received : " + first);
		System.out.println("second number received : " + second);
		int sum = first + second;
		return sum;
	}

}
