package Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = new int[5];
		myArray[3] = 45;
		myArray[1] = 25;
		myArray[2] = 55;
		myArray[0] = 75;
		myArray[4] = 65;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray[4]);
		
		int index = 0;
		while(index < 5) {
			System.out.println(myArray[index]);
			index++;
		}
		
		int index1 = 0;
		while(index < myArray.length) {
			System.out.println(myArray[index1]);
			index1++;
		}
		
		

	}

}
