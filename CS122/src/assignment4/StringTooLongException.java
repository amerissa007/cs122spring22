package assignment4;

import java.util.Scanner;

public class StringTooLongException {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a string with less than 20 characters.");


		try {
			String str = scan.nextLine();
			if(str.length()<20) {
				System.out.println("DONE!");
			}
			else {
				throw new Exception();
			}
			
		}
		catch(Exception e){
			System.out.println("String is longer than 20 characters.");
			
		}
		
	}
	
	

	

}
