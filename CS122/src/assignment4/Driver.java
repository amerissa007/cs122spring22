package assignment4;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InvalidDocumentCodeException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two-character designation for document.");


		try {
			String str = scan.nextLine();
			char firstChar = 'U';
			char firstChar1 = 'C';
			char firstChar2 = 'P';

			if(str.length()>2) {
				throw new InvalidDocumentCodeException("Designation is rather more than two characters or does not have proper code.");
			}else if(str.charAt(0)== firstChar) {
				System.out.println("DONE!");
			}else if(str.charAt(0)== firstChar1){
				System.out.println("DONE!");
			}else if(str.charAt(0)== firstChar2) {
				System.out.println("DONE!");
			}else
				throw new InvalidDocumentCodeException("Designation is rather more than two characters or does not have proper code.");
		}catch (InvalidDocumentCodeException e) {
			System.out.println(e.getMessage());
		}
	}

}
