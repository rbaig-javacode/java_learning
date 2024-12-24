package Function;

public class MultiplicationOfTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable(12);

	}
	
	public static void MultiplicationTable (int first)
	{
		System.out.println("first number received : " + first);
		int i = 1;
		while(i<=10) {
			System.out.println(first + "X" +i+ "="  + i*first);
			i++;
		}
		
	}

}
