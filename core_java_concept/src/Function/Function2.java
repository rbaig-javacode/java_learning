package Function;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//printFirstPattern();
		printSecondPattern();
		//printThirdPattern();
	}
	
	public static void printFirstPattern() {
		int rows = 0;
		while(rows < 5) {
			System.out.print("*");
			int i = 0;
			while(i<rows) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows++;
		}
		
	}
	
	public static void printSecondPattern() {
		int rows = 5;
		while(rows > 0) {
			System.out.print("*");
			int i = 1;
			while(i<rows) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	
	public static void printThirdPattern() {
		System.out.println("        *");
		System.out.println("      * *");
		System.out.println("    * * *");
		System.out.println("  * * * *");
		System.out.println("* * * * *");
	}

}
