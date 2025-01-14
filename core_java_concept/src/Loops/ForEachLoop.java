package Loops;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[] {
				"ram","mohan","seeta","geeta"
		};
		
		//printArray(array);
		printArrayForEach(array);

	}
	
	public static void printArrayForEach(String[] array) {
		for(String name : array) {
			System.out.println(name);
		}
	}
	
	public static void printArray(String[] array) {
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
