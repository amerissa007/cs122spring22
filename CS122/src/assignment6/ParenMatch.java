package assignment6;

import java.util.*;
import java.util.Scanner;

public class ParenMatch
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<Integer>();
		String line;
		Scanner scan = new Scanner(System.in);

		System.out.println("Parenthesis Matching\n");
		System.out.println("Enter a parenthesized expression: ");
		line = scan.next();       
		int len = line.length();
		System.out.println("\nMatches and Mismatches:\n");

		for (int i = 0; i < len; i++)
		{   
			char ch = line.charAt(i);
			if (ch == '(')
				s.push(i);
			else if (ch == ')')
			{
				try
				{
					int p = s.pop() + 1;
					System.out.println("'(' at index "+(i+1)+" matched with ')' at index "+p);
				}
				catch(Exception e)
				{
					System.out.println("'(' at index "+(i+1)+" is unmatched");
				}
			}           
		}
		while (!s.isEmpty() )
			System.out.println("'(' at index "+(s.pop() +1)+" is unmatched");
	}
}