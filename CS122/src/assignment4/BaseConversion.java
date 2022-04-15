package assignment4;

import java.util.Scanner;

public class BaseConversion {

	public static void main(String[] args) {
		int base10Num;
		int base;

		Scanner scan = new Scanner(System.in);

		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.print("Enter an integer: ");
		base10Num = scan.nextInt();
		System.out.print ("Enter the base: ");
		base = scan.nextInt();

		System.out.println(convert(base10Num, base));

	}

	public static String convert(int num, int b) {
		String[] letters = { "A", "B", "C", "D", "E", "F" };
		int quotient = num / b;
		int remainder = num % b;
		if (quotient == 0) {
			if (b > 10 && remainder >= 10)
				return letters[remainder % 10];
			else
				return ("" + remainder);
		} else {
			if (b > 10 && remainder >= 10)
				return convert(quotient, b) + letters[remainder % 10];
			else
				return convert(quotient, b) + remainder;
		}
	}
}