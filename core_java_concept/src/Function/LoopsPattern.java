package Function;

import java.util.Scanner;

public class LoopsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println(" we are here to print pattern");
		System.out.println("Please enter number of rows: ");
		int rows = input.nextInt();
		printFirstPattern(rows);
		System.out.println(" ");
		printSecondPattern(rows);
		printThirdPattern(rows);

	}
	
	public static void printFirstPattern(int maxRows)
	{
		int rows = 0;
		while(rows < maxRows) {
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
	
	public static void printSecondPattern(int maxRows) {
		int rows = maxRows;
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
	
	public static void printThirdPattern(int maxRows) {
		int rows = maxRows;
		while(rows > 0) {
			//this loop prints spaces
			int j = 0;
			while(j < rows-1) {
				System.out.print("  ");
				j++;
			}
			
			//this loops prints stars
			int i = 0;
			while(i <= (maxRows-rows)) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}

}
